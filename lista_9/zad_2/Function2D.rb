class Function2D
    def initialize(block)
        @block = block
    end

    def value(x,y)
        @block.call(x,y)
    end

    def volume(a, b, c, d)
        l_1 = (b-a)/500.0
        l_2 = (d-c)/500.0
        v = 0
        if (l_1 != 0) and (l_2 != 0)
            while a < b
                cc = c
                while cc < d
                    v += value(a,cc).abs
                    cc += l_2
                end
                a += l_1
            end
        end
        v * l_1 * l_2 
    end

    def contour_line(a, b, c, d, height)
        a_copy = a
        p = 0.5
        e = 0.0001
        while a_copy <= b
            c_copy = c
            while c_copy <= d
                val = value(a_copy,c_copy)
                if val <= height + e && val >= height - e
                    print "(" + a_copy.to_s + ", " + c_copy.to_s + ") "
                end
                c_copy += p
            end
            a_copy += p
        end
    end

end

