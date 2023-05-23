class RandomWordStream
{
   PrimeStream prime=new PrimeStream();
   RandomStream random=new RandomStream();

   public string next()
   {
       int length=prime.next();
       string s="";
       do 
       {
           int random_nr=random.next();
           string temp=random_nr.ToString();
           int min=Math.Min(length,temp.Length);
           s+=temp.Substring(0,min);
           length-=min;
       }
       while(length>0);
       return s;
   }
}