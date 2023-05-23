class Jawna
    def initialize(napis)
        @napis = napis
    end

    def zaszyfruj(key)
        s=""
        @napis.each_char { |c| 
            s+=key[c]
        }
        Zaszyfrowana.new(s)
    end

    def to_s
        @napis
    end
end

class Zaszyfrowana
    def initialize(zaszyfrowany)
        @zaszyfrowany = zaszyfrowany
    end

    def oszyfruj(key)
        rev_key=Hash[]
        key.each {|k, value| rev_key.store(value,k) }
        s = Jawna.new(@zaszyfrowany).zaszyfruj(rev_key)
        Jawna.new(s.to_s)
    end

    def to_s
        @zaszyfrowany
    end
end