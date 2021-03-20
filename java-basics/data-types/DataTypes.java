class DataTypes {
  public static void main(String[] args) {

    /*
    DataType : byte
    Size     : 1 byte
    Range    : -128 to 127(-2^7 to (2^7)-1)
    */
    byte b=10;
    /*
      byte b1=130;//C.E:possible loss of precision found : int required : byte
      byte b2=10.5;//C.E:possible loss of precision
      byte b3=true;//C.E:incompatible types
      byte b4="ashok";//C.E:incompatible types found : java.lang.String required : byte
    */
    /*
    byte data type is best suitable if we are handling data in terms of streams either from the file or from the network.
    */

    /*
    DataType : short
    Size     : 2 bytes
    Range    : -32768 to 32767(-2^15 to (2^15)-1)
    */
    short s=130;
    /*
      short s1=32768; //C.E:possible loss of precision
      short s=true;//C.E:incompatible types
    */
    /*
    Short data type is best suitable for
    16 bit processors like 8086
    but these processors are completely outdated and
    hence the corresponding short data type is also outdated data type.
    */

    /*
    DataType : int
    Size     : 4 bytes
    Range    : -2147483648 to 2147483647(-2^31 to (2^31)-1)
    */
    int i=130;
    /*
      int i1=10.5;//C.E:possible loss of precision
      int i2=true;//C.E:incompatible types
    */

    /*
    DataType : long
    Size     : 8 bytes
    Range    : (-2^63 to (2^63)-1)
    */
    long l=2147483649L;
    //long l1=f.length();//f is a file
    /*
    Whenever int is not enough to hold big values then we should go for long data type.
    */

    /*
    DataType : float
    Size     : 4 bytes
    Range    : -3.4e38 to 3.4e38
    */

    float f1=123.456f;
    /*
      float f=0.12;//C.E:possible loss of precision
    */

    /*
    DataType : double
    Size     : 8 bytes
    Range    : -1.7e308 to 1.7e308
    */
    double d = 0.12;
    double d1=123.456D;


    /*
    DataType : char
    Size     : 2 bytes
    Range    : 0 to 65535
    */
    char ch1=97;
    /*
      char ch2=65536;//C.E:possible loss of precision
    */
    /*
    In java we are allowed to use any worldwide alphabets character and java is Unicode
    based and no.Of unicode characters are > 256 and <= 65536 to represent all these
    characters one byte is not enough compulsory we should go for 2 bytes.
    */

    int bin = 0b111;//binary
    System.out.println(bin); //output : 7
    int x=10;   //decimal
    int y=010;  //octal
    int z=0x10; //hexadecimal

    double d_1=123.456;//valid
    double d_2=0123.456;//valid //it is treated as decimal value but not octal


    double d_4=0xBeef; System.out.println(d_4); //output : 48879.0

    long creditCardNumber = 1234_5678_9012_3456L;//valid
    long socialSecurityNumber = 999_99_9999L;//valid
    float pi =  3.14_15F;//valid
    long hexBytes = 0xFF_EC_DE_5E;//valid
    long hexWords = 0xCAFE_BABE;//valid
    long maxLong = 0x7fff_ffff_ffff_ffffL;//valid
    byte nybbles = 0b0010_0101;//valid
    long bytes = 0b11010010_01101001_10010100_10010010;//valid
    double d_5=1_23_456.7_8_9; //valid
    double d_6=123_456.7_8_9; //valid
    double d_7=1__23_456.789;//valid
    /*
      double d_3=0x123.456;//C.E:malformed floating point literal(invalid)
      double d_8=_1_23; //invalid
    */

    /*
    The main advantage of this approach is readability of the code
    will be improved
    At the time of compilation ' _ ' symbols will be removed automatically ,
    hence after compilation the above lines will become double d = 123456.789
    */

    /*
      Escape Characters
      \n -> newline characters
      \t -> horizontal tab
      \r -> carriage return
      \f -> form feed
      \b -> back space character
      \' -> single quote character
      \" -> double quote character
      \\ -> back space
    */

    double d = 234.04;
    long l = (long)d;   //explicit type casting
    int i = (int)l;     //explicit type casting

    int i = 300;
    long l = i;     //no explicit type casting
    float f = l;    //no explicit type casting
  }
}
