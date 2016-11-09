/*
		UML Class Diagram

		LinearEquation
		-------------------------------------------------------------------------------------------------------
		a:double
		b:double
		c:double
		d:double
		e:double
		f:double
		-------------------------------------------------------------------------------------------------------
		LinearEquation()
		LinearEquation(NewA: double, NewB: double, NewC: double, NewD: double, NewE: double, NewF: double)
		setLinearEquation(NewA: double, NewB: double, NewC: double, NewD: double, NewE: double, NewF: double): void
		getNumA(): double
		getNumB(): double
		getNumC(): double
		getNumD(): double
		getNumE(): double
		getNumF(): double
		setNumA(newA: double): void
		setNumB(newB: double): void
		setNumC(newC: double): void
		setNumD(newD: double): void
		setNumE(newE: double): void
		setNumF(newF: double): void


*/

import java.io.*;
import java.util.*;

public class LinearEquation
{
	 private double a,b,c,d,e,f;


	// Constructor sets all variables to zero
	public LinearEquation()
	{
		a=0;
		b=0;
		c=0;
		d=0;
		e=0;
		f=0;
	}

	//Constructs a equation with sepcific valuses
	public LinearEquation(double newA, double newB, double newC,double newD, double newE, double newF)
	{
		a= newA;
		b= newB;
		c= newC;
		d= newD;
		e= newE;
		f= newF;
	}

	//Another constructor thats sets specific values
	public void setLinearEquation(double newA, double newB, double newC,double newD, double newE, double newF)
		{
			a= newA;
			b= newB;
			c= newC;
			d= newD;
			e= newE;
			f= newF;
		}

	//Accessor Methods
	public double getNumA(){return a;}
	public double getNumB(){return b;}
	public double getNumC(){return c;}
	public double getNumD(){return d;}
	public double getNumE(){return e;}
	public double getNumF(){return f;}

	//Mutator Methods
	public void setNumA(double newA){a = newA;}
	public void setNumB(double newB){b = newB;}
	public void setNumC(double newC){c = newC;}
	public void setNumD(double newD){d = newD;}
	public void setNumE(double newE){e = newE;}
	public void setNumF(double newF){f = newF;}

	boolean isSolvable()
	{
		boolean solvable = false;

		if( ( ( getNumA() * getNumD()) - (getNumB()*getNumC() ) ) != 0)
			{solvable = true;}
			return solvable;
	}

	double getX()
	{
		return( ( (getNumE() * getNumD()) - (getNumB() * getNumF() ) ) / ( ( getNumA() * getNumD()) - (getNumB()*getNumC() ) ) );
	}

	double getY()
	{
		return( ( (getNumA() * getNumF()) - (getNumE() * getNumC() ) ) / ( ( getNumA() * getNumD()) - (getNumB()*getNumC() ) ) );
	}

}