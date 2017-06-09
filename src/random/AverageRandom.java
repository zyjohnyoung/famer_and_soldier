package random;

/**
 * Created by yangzhang on 2017/4/20.
 */
public class AverageRandom {
    private int m_min = 0;
    private int m_max = 1;
    static java.util.Random m_random=new java.util.Random(100);
    public AverageRandom(int min, int max){
        m_min = min;
        m_max = max;
    }
    public AverageRandom(){
    }
    public int getRandom(int min, int max){
        m_min = min;
        m_max = max;
        int result = m_random.nextInt()%(m_max-m_min);
        if (result<0)
            result=result*(-1);
        result = result+m_min;
        return result;
    }
    public int getRandom(){
        int result = m_random.nextInt()%(m_max-m_min);
        if (result<0)
            result=result*(-1);
        result = result+m_min;
        return result;
    }
}
