package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlattenMapUtilTest {

    private static Map<String, String> flattenMap = new HashMap<String, String>();

    @BeforeClass
    public static void setUp() throws Exception {
        flattenMap.put("TestResponse.Array[0].ObjectA.MemberA", "Value0AA");
        flattenMap.put("TestResponse.Array[0].ObjectA.MemberB", "Value0AB");
        flattenMap.put("TestResponse.Array[0].ObjectB.MemberA", "Value0BA");
        flattenMap.put("TestResponse.Array[0].ObjectB.MemberB", "Value0BB");
        flattenMap.put("TestResponse.Array[0].ObjectB.ObjectA.MemberA", "Value0BAA");
        flattenMap.put("TestResponse.Array[0].ObjectB.ObjectA.MemberB", "Value0BAB");
        flattenMap.put("TestResponse.Array[0].MemberA", "Value0A");

        flattenMap.put("TestResponse.Array[1].ObjectA.MemberA", "Value1AA");
        flattenMap.put("TestResponse.Array[1].ObjectA.MemberB", "Value1AB");
        flattenMap.put("TestResponse.Array[1].ObjectB.MemberA", "Value1BA");
        flattenMap.put("TestResponse.Array[1].ObjectB.MemberB", "Value1BB");
        flattenMap.put("TestResponse.Array[1].MemberA", "Value1A");

        flattenMap.put("TestResponse.Array[2].ObjectA.MemberA", "Value2AA");
        flattenMap.put("TestResponse.Array[2].ObjectA.MemberB", "Value2AB");
        flattenMap.put("TestResponse.Array[2].ObjectB.MemberA", "Value2BA");
        flattenMap.put("TestResponse.Array[2].ObjectB.MemberB", "Value2BB");
        flattenMap.put("TestResponse.Array[2].MemberA", "Value2A");

        flattenMap.put("TestResponse.Array.Length", "3");

    }

    @Test
    public void toListMap() {
        List<Map<Object, Object>> listMap = FlattenMapUtil.toListMap(flattenMap, "TestResponse.Array");

        Map<?, ?> map0A = (Map<?, ?>)(listMap.get(0).get("ObjectA"));
        Assert.assertEquals("Value0AA", map0A.get("MemberA"));
        Assert.assertEquals("Value0AB", map0A.get("MemberB"));

        Map<?, ?> map0B = (Map<?, ?>)listMap.get(0).get("ObjectB");
        Assert.assertEquals("Value0BA", map0B.get("MemberA"));
        Assert.assertEquals("Value0BB", map0B.get("MemberB"));

        Map<?, ?> map0BA = (Map<?, ?>)map0B.get("ObjectA");
        Assert.assertEquals("Value0BAA", map0BA.get("MemberA"));
        Assert.assertEquals("Value0BAB", map0BA.get("MemberB"));

        Map<?, ?> map1A = (Map<?, ?>)listMap.get(1).get("ObjectA");
        Assert.assertEquals("Value1AA", map1A.get("MemberA"));
        Assert.assertEquals("Value1AB", map1A.get("MemberB"));

        Map<?, ?> map1B = (Map<?, ?>)listMap.get(1).get("ObjectB");
        Assert.assertEquals("Value1BA", map1B.get("MemberA"));
        Assert.assertEquals("Value1BB", map1B.get("MemberB"));

        Map<?, ?> map2A = (Map<?, ?>)listMap.get(2).get("ObjectA");
        Assert.assertEquals("Value2AA", map2A.get("MemberA"));
        Assert.assertEquals("Value2AB", map2A.get("MemberB"));

        Map<?, ?> map2B = (Map<?, ?>)listMap.get(2).get("ObjectB");
        Assert.assertEquals("Value2BA", map2B.get("MemberA"));
        Assert.assertEquals("Value2BB", map2B.get("MemberB"));

    }

    @Test
    public void toMap() {
        Map<?, ?> map = FlattenMapUtil.toMap(flattenMap, "TestResponse");

        Map<?, ?> testMap = (Map<?, ?>)map.get("TestResponse");

        List<?> listMap = (List<?>)testMap.get("Array");
        Map<?, ?> item0 = (Map<?, ?>)listMap.get(0);
        Map<?, ?> map0A = (Map<?, ?>)item0.get("ObjectA");
        Assert.assertEquals("Value0AA", map0A.get("MemberA"));
        Assert.assertEquals("Value0AB", map0A.get("MemberB"));

        Map<?, ?> map0B = (Map<?, ?>)item0.get("ObjectB");
        Assert.assertEquals("Value0BA", map0B.get("MemberA"));
        Assert.assertEquals("Value0BB", map0B.get("MemberB"));

        Map<?, ?> map0BA = (Map<?, ?>)map0B.get("ObjectA");
        Assert.assertEquals("Value0BAA", map0BA.get("MemberA"));
        Assert.assertEquals("Value0BAB", map0BA.get("MemberB"));

        Map<?, ?> item1 = (Map<?, ?>)listMap.get(1);
        Map<?, ?> map1A = (Map<?, ?>)item1.get("ObjectA");
        Assert.assertEquals("Value1AA", map1A.get("MemberA"));
        Assert.assertEquals("Value1AB", map1A.get("MemberB"));

        Map<?, ?> map1B = (Map<?, ?>)item1.get("ObjectB");
        Assert.assertEquals("Value1BA", map1B.get("MemberA"));
        Assert.assertEquals("Value1BB", map1B.get("MemberB"));

        Map<?, ?> item2 = (Map<?, ?>)listMap.get(2);
        Map<?, ?> map2A = (Map<?, ?>)item2.get("ObjectA");
        Assert.assertEquals("Value2AA", map2A.get("MemberA"));
        Assert.assertEquals("Value2AB", map2A.get("MemberB"));

        Map<?, ?> map2B = (Map<?, ?>)item2.get("ObjectB");
        Assert.assertEquals("Value2BA", map2B.get("MemberA"));
        Assert.assertEquals("Value2BB", map2B.get("MemberB"));
    }
}