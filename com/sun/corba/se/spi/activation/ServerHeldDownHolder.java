package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ServerHeldDownHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-macosx-x86_64/jdk8u66/4988/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, October 6, 2015 4:10:32 PM PDT
*/

public final class ServerHeldDownHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.ServerHeldDown value = null;

  public ServerHeldDownHolder ()
  {
  }

  public ServerHeldDownHolder (com.sun.corba.se.spi.activation.ServerHeldDown initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ServerHeldDownHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ServerHeldDownHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ServerHeldDownHelper.type ();
  }

}
