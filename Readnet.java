import java.io.*;
  import java.net.*;
  
  public class Readnet
  {

  	public static void main(String[] args)
  	{
  		byte[]	buff	=	new	byte[1024];		// 読み取り用の配列(1kByte)
  		Socket	readsock	=	null;		// ソケット
  		InputStream	instr	=	null;		// ストリーム
  		boolean	cont	=	true;		// フラグ
  
  		// 指定のポートに接続し、ソケットを作成する。te
  		//	次に InputStream オブジェクトを生成する。
      for(int i = 0; i<10000;i++){
        try {
        readsock  = new Socket(args[0], Integer.parseInt(args[1]));
        instr = readsock.getInputStream();
      }
      catch (Exception  e)  {
        System.err.println("ネットワークエラーです。");
        System.exit(1);
      }
  
      }
  		
  
  		// データ終了まで次の処理を繰り返す。
  		while(cont)
  		{
  			try	{
  				int	n	=	instr.read(buff);
  				System.out.write(buff,	0,	n);
  			}
  			catch	(Exception	e)	{
  				cont	=	false;
  			}
  		}
  
  
  		//	接続を閉じる。
  		try	{
  			instr.close();
  		}
  		catch	(Exception	e)	{
  			System.err.println("ネットワークのエラーです。");
  			System.exit(1);
  		}
  
  	}
  }
  