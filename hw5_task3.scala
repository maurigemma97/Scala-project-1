import scala.language.postfixOps
def foo =
	{
	var a = 5
	var b = 0
	
	while(a <= 24){
		b = (a * a)*a
		println("the cube of" + a + " is " + b)
		/*
		println(a)
		println("is")
		println(b)
		*/
		a = a + 1
	}
}
foo
