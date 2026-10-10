package com.tencent.bugly.proguard;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.xi */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34026xi {

    /* JADX INFO: renamed from: a */
    public static String f72533a;

    /* JADX INFO: renamed from: b */
    public static String f72534b;

    /* JADX INFO: renamed from: c */
    public static String f72535c;

    /* JADX INFO: renamed from: a */
    public static String m75465a() {
        return f72534b;
    }

    static {
        try {
            InputStream resourceAsStream = C34026xi.class.getResourceAsStream("/com/qq/jce/wup/wup.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            resourceAsStream.close();
            f72533a = properties.getProperty("client.info");
            f72534b = properties.getProperty("client.built");
            f72535c = properties.getProperty("client.number");
        } catch (Throwable unused) {
        }
        if (f72533a == null) {
            f72533a = "Tencent Taf";
        }
        if (f72534b == null) {
            f72534b = "unknown";
        }
        if (f72535c == null) {
            f72535c = "unknown";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75466a(String[] strArr) {
        System.out.println(m75469d());
        System.out.println("Client version: " + f72533a);
        System.out.println("Client built:   " + f72534b);
        System.out.println("Client number:  " + f72535c);
        System.out.println("OS Name:        " + System.getProperty("os.name"));
        System.out.println("OS Version:     " + System.getProperty("os.version"));
        System.out.println("Architecture:   " + System.getProperty("os.arch"));
        System.out.println("JVM Version:    " + System.getProperty("java.runtime.version"));
        System.out.println("JVM Vendor:     " + System.getProperty("java.vm.vendor"));
    }

    /* JADX INFO: renamed from: b */
    public static String m75467b() {
        return f72533a;
    }

    /* JADX INFO: renamed from: c */
    public static String m75468c() {
        return f72535c;
    }

    /* JADX INFO: renamed from: d */
    public static String m75469d() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Client version: " + f72533a + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        stringBuffer.append("Client built:   " + f72534b + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        stringBuffer.append("Client number:  " + f72535c + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        stringBuffer.append("OS Name:        " + System.getProperty("os.name") + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        stringBuffer.append("OS Version:     " + System.getProperty("os.version") + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        stringBuffer.append("Architecture:   " + System.getProperty("os.arch") + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        stringBuffer.append("JVM Version:    " + System.getProperty("java.runtime.version") + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        stringBuffer.append("JVM Vendor:     " + System.getProperty("java.vm.vendor") + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        return stringBuffer.toString();
    }
}
