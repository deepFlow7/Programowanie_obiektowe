require_relative 'Function'

f1 = Function.new(proc { |x| x*x*Math.sin(x) })
print "f1(x) = x*x*Math.sin(x)\n"
print "f1(1) = " + f1.value(1).to_s + "\nZero : "
f1.zero(0,2,0.01)
print "\nField : " + f1.field(0,1).to_s + "\n"
print "Deriv : " + f1.deriv(1).to_s + "\n\n"

f2 = Function.new(proc { |x| x*x-1 })
print "f2(x) = 2*x*x-1\n"
print "f2(2) = " + f2.value(2).to_s + "\nZero : "
f2.zero(-1,1,0.5)
print "\nField : " + f2.field(-3,1).to_s + "\n"
print "Deriv : " + f2.deriv(0).to_s + "\n"