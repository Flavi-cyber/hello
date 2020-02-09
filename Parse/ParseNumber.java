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
          sb.append( "\nparsed value = ");
          sb.append( val );
          
          sb.append( "\nmy own parse function: ");
          sb.append( ParseInt(args[0].toCharArray() ));
        }
        catch(NumberFormatException e)
        {
          val = 0;
          sb.append("; error parsing integer!");
        }
      }
      System.out.println(sb.toString());
   }
   
   static int ParseInt( char[] characters) throws NumberFormatException
   {
      int value = 0;
      for( int i = 0; i < characters.length; i++ )
      {
         if( !Character.isDigit(characters[i]) )
         {
            throw new NumberFormatException();
         }
         value *=10;
         value += characters[i] - '0';
      }
      return value;
   }   
}
