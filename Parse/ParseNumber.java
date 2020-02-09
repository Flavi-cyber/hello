import javax.swing.JOptionPane;

public class ParseNumber
{
   public static void main(String[] args )
   {
      StringBuilder sb = new StringBuilder();
      sb.append( "nr of args = ");
      sb.append( args.length );
      if( args.length > 0)
      {
        sb.append( "; first argument = " );
        sb.append( args[0]);
        int val = 0;
        try{
          val = Integer.parseInt( args[0] );
          sb.append( "; parsed value = ");
          sb.append( val );
        }
        catch(NumberFormatException e)
        {
          val = 0;
          sb.append("; error parsing integer!");
        }
      }
      System.out.println(sb.toString());
   }
}
