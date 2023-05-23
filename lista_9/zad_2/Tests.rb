require_relative 'Function2D'

f1 = Function2D.new(proc { |x, y| x*y})
print "f1(x,y) = x*y\n"
print "f1(1,1) = " + f1.value(1,1).to_s + "\n"
print "Volume : " + f1.volume(0,10,1,5).to_s + "\n"
print "Contour line : "
f1.contour_line(0,5,0,2,1)
puts "\n\n"


f2 = Function2D.new(proc { |x, y| x+y })
print "f2(x,y) = x+y\n"
print "f2(-3,4) = " + f2.value(-3,4).to_s + "\n"
print "Volume : " + f2.volume(-2,10,3,4).to_s + "\n"
print "Contour line : "
f2.contour_line(0,2,0.5,1,0)
puts "\n\n"
