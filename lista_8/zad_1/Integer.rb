class Integer

    def czynniki
        d=2
        tab = [1]
        while d < self.abs
            if self % d == 0
                tab.push(d)
            end
            d=d + 1
        end
        tab.push(self)
        tab
    end

    def ack(y)
        if self == 0
            y+1
        else
            if y == 0
                d=self-1
                d.ack(1)
            else
                d=self-1
                y=y-1
                d.ack(self.ack(y))
            end
        end
    end 
    
    def doskonała
        d=self.czynniki
        sum=0
        d.each do |n|
            if n < self
                sum+=n
            end
        end
        if sum == self
            true
        else false
        end
    end

    def słownie
        s = ""
        słownik = 
        {
            0 => "zero",
            1 => "jeden",
            2 => "dwa",
            3 => "trzy",
            4 => "cztery",
            5 => "pięć",
            6 => "sześć",
            7 => "siedem",
            8 => "osiem",
            9 => "dziewięć"
        }

        if self == 0
            s += "zero"
        else
            temp = self.abs
            while temp > 0
                s=słownik[temp%10] + " " + s
                temp /= 10
            end
            if self < 0
                s += "-"
            end
        end
        s
    end

end