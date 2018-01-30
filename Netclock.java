import	java.io.*;
  import	java.net.*;
  import	java.util.*;
  
  class	Netclock
  {
  	public static void	main(String[]	args)
  	{
  		ServerSocket	servsock	=	null;
  		Socket	sock;
  		OutputStream	out;					
  		String	outstr;
  		int	i;
  		Date	d;
  
  		try	{
  			servsock	=	new	ServerSocket(6000,	300);
  
  			while(true)
  			{
  				sock	=	servsock.accept();		
  
  				d	=	new	Date();
  				outstr	=	"\n"
  								+	"Welcome to New World"
  								+	"\n"	+	d.toString()	+	"\n"
  								+	"New World is not real!!Bye Bye!!"	+	"\n";
          System.out.println(sock.getInetAddress());
  				out	=	sock.getOutputStream();
  				for(i=0;	i<outstr.length();	i++)
  					out.write((int)	outstr.charAt(i));
  				out.write('\n');
  
  				sock.close();
  			}
  		}
  		catch	(IOException	e)	{
  			System.exit(1);
  		}
  	}
  }