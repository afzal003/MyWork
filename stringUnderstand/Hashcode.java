package stringUnderstand;

public class Hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="raj";
String x="raj";
String ss=" rajkumar ";

System.out.println(s.hashCode());
System.out.println(ss.hashCode());
System.out.println(s);
System.out.println(ss);
System.out.println(ss.trim());
System.out.println(ss.length());
System.out.println(ss.substring(2));
System.out.println(ss.substring(2, 3));//start value will be considered.. not end value...
System.out.println(ss.toLowerCase());
System.out.println(ss.toUpperCase());
System.out.println(ss.indexOf('a'));
//System.out.println(s.charAt(4));
System.out.println(s.compareTo(x));
System.out.println(ss.equals(s));
System.out.println(ss);
System.out.println(ss.concat(s));

String d="";// length is 0
String d1=" ";// length is 1 & index value is 0
String e=null;
String f="king";
String g="king";
System.out.println(d.length());
//System.out.println(e.length());
System.out.println(f.hashCode());
System.out.println(g.hashCode());
System.out.println(g.equals(f));

//System.out.println(s.charAt(4)); String index out of range: 4

String z="welcome";
z=z.toUpperCase();
System.out.println(z);

String i="ram"+"kumar";
System.out.println(i.length());

String a="",aa="r",aaa="j";
a=aa+aaa;
System.out.println(a);

String u="raj";
String v="ram";//compares J & m,then returns the result...
System.out.println(v.compareTo(u));// compares based on lexicographically
	}

}
