package com.susiha.codenotes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 苏斯哈 on 2016/10/21.
 */

public class DataUtils {

    /**
     *
     * @return
     */
    public static List<String> creatStringListMode()
    {

        ArrayList<String> stringData=new ArrayList<String>();

        for (int i='A';i<'Z';i++)
        {
            stringData.add((char)i+"");
        }
        return stringData;
    }

}
