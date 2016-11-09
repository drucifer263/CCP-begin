/*
Drew Watson
CSCI112
Assignment 6
03/25/13
Goldberg
*/

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiGeometricObject3 extends JFrame
{
	public JLabel objLB,messageLB;
	public JButton okbutton;
	public JPanel panel, pane;
	public JTextField objTF,messageTF;
	public okButtonHandler okbh;

	public GuiGeometricObject3()
	{
		//Panels and Layouts
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,2,10,10));

		pane = new JPanel();
		pane.setLayout(new BorderLayout());

		//Object textfeild and label
		objLB = new JLabel("Enter your geometric object here (rectangle, circle, sphere): ", SwingConstants.RIGHT);
		objTF = new JTextField(8);

		//Buttons
		okbutton = new JButton("OK");
		okbh = new okButtonHandler();
		okbutton.addActionListener(okbh);

		//Output message
		messageLB = new JLabel("Message", SwingConstants.RIGHT);
		messageTF = new JTextField(8);

		//First panel
		panel.add(objLB);
		panel.add(objTF);
		panel.add(messageLB);
		panel.add(messageTF);

		//Second panel
		pane.add(okbutton,BorderLayout.SOUTH);
		pane.add(panel);

		//Adds combined panels to frame
		add(pane);

		//Creates Frame
		setTitle("Geometric Object");
		setSize(750,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}



	public class RectangleProgram extends JFrame
	{
   		private JLabel lengthLB, widthLB, areaLB, perimeterLB;
		private JTextField lengthTF, widthTF, areaTF, perimeterTF;
		private JButton calculateB, exitB;
		private CalculateButtonHandler cbHandler;
   		private ExitButtonHandler ebHandler;
		private static final int WIDTH = 400;
   		private static final int HEIGHT = 300;

   		public RectangleProgram()
   		{
             //Create the four labels
      		lengthLB = new JLabel("Enter the length: ", SwingConstants.RIGHT);
      		widthLB = new JLabel("Enter the width: ", SwingConstants.RIGHT);
      		areaLB = new JLabel("Area: ", SwingConstants.RIGHT);
      		perimeterLB = new JLabel("Perimeter: ", SwingConstants.RIGHT);


             //Create the four text fields
      		lengthTF = new JTextField(10);
      		widthTF = new JTextField(10);
     		areaTF = new JTextField(10);
     		perimeterTF = new JTextField(10);

             //Create Calculate Button
      		calculateB = new JButton("Calculate");
      		cbHandler = new CalculateButtonHandler();
      		calculateB.addActionListener(cbHandler);

             //Create Exit Button
      		exitB = new JButton("Exit");
      		ebHandler = new ExitButtonHandler();
      		exitB.addActionListener(ebHandler);

             //Set the title of the window
      		setTitle("Area and Perimeter of a Rectangle");

             //Get the container
      		Container pane = getContentPane();

             //Set the layout
      		pane.setLayout(new GridLayout(5, 2));

             //Place the components in the pane
      		pane.add(lengthLB);
      		pane.add(lengthTF);
      		pane.add(widthLB);
      		pane.add(widthTF);
      		pane.add(perimeterLB);
      		pane.add(perimeterTF);
      		pane.add(areaLB);
      		pane.add(areaTF);
      		pane.add(calculateB);
      		pane.add(exitB);

             //Set the size of the window and display it
      		setSize(WIDTH, HEIGHT);
      		setVisible(true);
      		setDefaultCloseOperation(EXIT_ON_CLOSE);
  	 	}

   		private class CalculateButtonHandler implements ActionListener
   		{
      		public void actionPerformed(ActionEvent e)
      		{
         		double width, length, area, perimeter;

         		length = Double.parseDouble(lengthTF.getText());
         		width = Double.parseDouble(widthTF.getText());
         		area = length * width;
         		perimeter = 2.0 * (length + width);

         		areaTF.setText("" + area);
         		perimeterTF.setText("" + perimeter);
      		}
   		}

   		private class ExitButtonHandler implements ActionListener
   		{
       		public void actionPerformed(ActionEvent e)
       		{
          		System.exit(0);
       		}
   		}
	}

	public class CircleProgram extends JFrame
	{
   		private JLabel radiusLB, diameterLB, areaLB, circumferenceLB;
		private JTextField radiusTF, diameterTF, areaTF, circumferenceTF;
		private JButton calculateB, exitB;
		private CalculateButtonHandler cbHandler;
   		private ExitButtonHandler ebHandler;
		private static final int WIDTH = 450;
   		private static final int HEIGHT = 300;

   		public CircleProgram()
   		{
             //Labels
      		radiusLB = new JLabel("Enter the radius here: ", SwingConstants.RIGHT);
      		diameterLB = new JLabel("Diameter: ", SwingConstants.RIGHT);
      		areaLB = new JLabel("Area: ", SwingConstants.RIGHT);
      		circumferenceLB = new JLabel("Circumference: ", SwingConstants.RIGHT);


             //Text fields
      		radiusTF = new JTextField(10);
     		diameterTF = new JTextField(10);
     		areaTF = new JTextField(10);
     		circumferenceTF = new JTextField(10);

             //Calculate Button
      		calculateB = new JButton("Calculate");
      		cbHandler = new CalculateButtonHandler();
      		calculateB.addActionListener(cbHandler);

             //Exit Button
      		exitB = new JButton("Exit");
      		ebHandler = new ExitButtonHandler();
      		exitB.addActionListener(ebHandler);

             //Title
      		setTitle("Diameter, Circumference, and Area  of a Circle");

             //Container
      		Container pane = getContentPane();

             //Layout
      		pane.setLayout(new GridLayout(5, 2));

             //Place the components in the pane
      		pane.add(radiusLB);
      		pane.add(radiusTF);
      		pane.add(diameterLB);
      		pane.add(diameterTF);
      		pane.add(circumferenceLB);
      		pane.add(circumferenceTF);
      		pane.add(areaLB);
      		pane.add(areaTF);
      		pane.add(calculateB);
      		pane.add(exitB);

             //Set the size of the window and display it
      		setSize(WIDTH, HEIGHT);
      		setVisible(true);
      		setDefaultCloseOperation(EXIT_ON_CLOSE);
  	 	}

   		private class CalculateButtonHandler implements ActionListener
   		{
      		public void actionPerformed(ActionEvent e)
      		{
         		double radius, diameter, area, circumference;

         		radius = Double.parseDouble(radiusTF.getText());
         		diameter = radius * 2.0;
         		area = (Math.pow(radius,2)) * Math.PI;
         		circumference = (2.0 * radius ) * Math.PI;

         		diameterTF.setText("" + diameter);
         		areaTF.setText("" + area);
         		circumferenceTF.setText("" + circumference);
      		}
   		}

   		private class ExitButtonHandler implements ActionListener
   		{
       		public void actionPerformed(ActionEvent e)
       		{
          		System.exit(0);
       		}
   		}
	}

	public class SphereProgram extends JFrame
	{
   		private JLabel radiusLB, circumferenceLB, volumeLB, surfaceAreaLB, diameterLB;
		private JTextField radiusTF,circumferenceTF, volumeTF, surfaceAreaTF, diameterTF;
		private JButton calculateB, exitB;
		private CalculateButtonHandler cbHandler;
   		private ExitButtonHandler ebHandler;
		private static final int WIDTH = 550;
   		private static final int HEIGHT = 300;

   		public SphereProgram()
   		{
             //Labels
      		radiusLB = new JLabel("Enter the radius here: ", SwingConstants.RIGHT);
      		diameterLB = new JLabel("Diameter: ", SwingConstants.RIGHT);
      		circumferenceLB = new JLabel("Circumference: ", SwingConstants.RIGHT);
      		volumeLB = new JLabel("Volume: ", SwingConstants.RIGHT);
      		surfaceAreaLB = new JLabel("SurfaceArea: ", SwingConstants.RIGHT);


             //Text fields
      		radiusTF = new JTextField(10);
     		diameterTF = new JTextField(10);
     		circumferenceTF = new JTextField(10);
     		volumeTF = new JTextField(10);
     		surfaceAreaTF = new JTextField(10);

             //Calculate Button
      		calculateB = new JButton("Calculate");
      		cbHandler = new CalculateButtonHandler();
      		calculateB.addActionListener(cbHandler);

             //Exit Button
      		exitB = new JButton("Exit");
      		ebHandler = new ExitButtonHandler();
      		exitB.addActionListener(ebHandler);

             //Title
      		setTitle("Diameter, Circumference, Surface Area, and Volume  of a Sphere");

             //Container
      		Container pane = getContentPane();

             //Layout
      		pane.setLayout(new GridLayout(6, 2));

             //Place the components in the pane
      		pane.add(radiusLB);
      		pane.add(radiusTF);
      		pane.add(diameterLB);
      		pane.add(diameterTF);
      		pane.add(circumferenceLB);
      		pane.add(circumferenceTF);
      		pane.add(surfaceAreaLB);
      		pane.add(surfaceAreaTF);
      		pane.add(volumeLB);
      		pane.add(volumeTF);
      		pane.add(calculateB);
      		pane.add(exitB);

             //Set the size of the window and display it
      		setSize(WIDTH, HEIGHT);
      		setVisible(true);
      		setDefaultCloseOperation(EXIT_ON_CLOSE);
  	 	}

   		private class CalculateButtonHandler implements ActionListener
   		{
      		public void actionPerformed(ActionEvent e)
      		{
         		double radius, diameter, circumference, volume, surfaceArea;

         		radius = Double.parseDouble(radiusTF.getText());
         		diameter = (2.0) * (radius);
         		circumference = (2.0) * (Math.PI) * (radius);
         		volume = (4.0/3.0) * ((Math.PI) * (Math.pow(radius,3)));
         		surfaceArea = (4.0) * (Math.PI) * (Math.pow(radius,2));

				diameterTF.setText("" + diameter);
				circumferenceTF.setText("" + circumference);
         		volumeTF.setText("" + volume);
         		surfaceAreaTF.setText("" + surfaceArea);
      		}
   		}

   		private class ExitButtonHandler implements ActionListener
   		{
       		public void actionPerformed(ActionEvent e)
       		{
          		System.exit(0);
       		}
   		}
	}

	public class okButtonHandler implements ActionListener
	{
	      public void actionPerformed(ActionEvent e)
	      {
	         String input;

	        input = objTF.getText();

	        if(input.equals("rectangle")||input.equals("Rectangle")||input.equals("RECTANGLE"))
				{
					messageTF.setText("Parameters of a Rectangle");
					RectangleProgram rectObject = new RectangleProgram();

				}

			else if(input.equals("circle")||input.equals("Circle")||input.equals("CIRCLE"))
				{
					messageTF.setText("Parameters of a Circle");
					CircleProgram circObject = new CircleProgram();

				}

			else if(input.equals("sphere")||input.equals("Sphere")||input.equals("SPHERE"))
				{
					messageTF.setText("Parameters of a Sphere");
					SphereProgram spheObject = new SphereProgram();

				}
			else
				{
					messageTF.setText(input +" is not a Geometric Object");
				}

	      }
  	}




	public static void main (String [] args)
	{
		GuiGeometricObject3 guigeo = new GuiGeometricObject3();
	}


}