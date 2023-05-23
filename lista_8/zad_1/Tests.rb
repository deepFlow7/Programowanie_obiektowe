require_relative 'Integer'

d=72
print "Czynniki "+d.to_s+" : "
d.czynniki.each { | val | print val, " " }
print "\n"

print "Ackerman (2, 1) = "
print 2.ack(1)
print "\n"

m=7
print "Czy " + m.to_s + " doskonała? " + m.doskonała.to_s
print "\n"

k=1236
print k.to_s + " to : " + k.słownie
print "\n"