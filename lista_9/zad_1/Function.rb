class Function
    def initialize(block)
        @block = block
    end

    def value(x)
        @block.call(x)
    end

    def zero(a,b,e)
        fst = 1
        while a <= b
            if @block.call(a) == 0
                if fst == 1
                    fst = 0
                else 
                    print ", "
                end
                print a.to_s
            end
            a += e
        end
    end

    def field(a,b)
        f = 0
        e = (b - a)/1000.0
        while a < b
            f += @block.call(a).abs * e
            a += e
        end
        f
    end

    def deriv(x)
        dx = 1.0e-6
        dy = @block.call(x+dx) - @block.call(x-dx);
        dy/(2.0*dx);
    end
end

