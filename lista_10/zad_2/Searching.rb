require_relative 'Collection'

class Searching
    def binary_search(x, list)
        binary(0,list.length-1,x,list)
    end

    private 
    def binary(b, e, x, list)
        if b > e
            return -1
        end
        s = (e+b)/2
        v = list.get(s)
        if v == x
            s
        else
            if v < x
                binary(s+1,e,x,list)
            else
                binary(b,s-1,x,list)
            end
        end
    end

    public
    def interpolation_search(x,list)
        a = 0
        b = list.length-1
        while list.get(a) <= x && list.get(b) >= x 
            p = a + (x - list.get(a)) * (b - a) / (list.get(b) - list.get(a))
            v = list.get(p)
            if v == x
                return p
            end
            if v > x
                a = p + 1
            else
                b = p - 1
            end
        end
        -1
    end
end

