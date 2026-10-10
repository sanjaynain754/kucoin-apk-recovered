package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.annotation.WorkerThread;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AFLogger;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class AFf1jSDK {
    private static AFf1jSDK getRevenue;
    private final Map<String, String> getMonetizationNetwork = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFf1jSDK.3
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
            put("ac", "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put("ai", "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put("al", "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put("ap", "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put(TUIThemeManager.LANGUAGE_AR, "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put(CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, "ro.product.cpu.abilist64");
        }
    };

    private static boolean AFAdRevenueData(String str) {
        return str.matches("\\d+");
    }

    private AFg1dSDK getMediationNetwork(Context context) {
        AFg1dSDK aFg1dSDK = new AFg1dSDK();
        try {
            aFg1dSDK.AFAdRevenueData(AFa1zSDK.HOOKING.AFAdRevenueData, getCurrencyIso4217Code());
            aFg1dSDK.AFAdRevenueData(AFa1zSDK.DEBUGGABLE.AFAdRevenueData, Boolean.valueOf(getCurrencyIso4217Code(context)));
            return aFg1dSDK;
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th2);
            return aFg1dSDK;
        }
    }

    @SuppressLint({"PrivateApi"})
    private static String getRevenue(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e11) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e11);
            return null;
        }
    }

    public final Object getCurrencyIso4217Code(Context context, String str) throws Throwable {
        String str2 = null;
        if (str != null) {
            try {
                str2 = AFAdRevenueData(str) ? null : "invalid timestamp";
            } catch (Exception e11) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e11);
                return str2;
            }
        }
        AFg1dSDK aFg1dSDK = new AFg1dSDK();
        aFg1dSDK.AFAdRevenueData(CmcdConfiguration.KEY_PLAYBACK_RATE, getMediationNetwork());
        aFg1dSDK.AFAdRevenueData("an", getMediationNetwork(context));
        return aFg1dSDK;
    }

    public enum AFa1tSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String getMediationNetwork;

        AFa1tSDK(String str) {
            this.getMediationNetwork = str;
        }
    }

    public enum AFa1zSDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String AFAdRevenueData;

        AFa1zSDK(String str) {
            this.AFAdRevenueData = str;
        }
    }

    private static boolean AFAdRevenueData(String str, String str2) throws Exception {
        String line;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(line.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e11) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e11);
            throw new Exception("FNF");
        } catch (IOException e12) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e12);
            throw new Exception("IOF");
        } catch (Exception e13) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e13);
            throw new Exception("GF");
        }
    }

    @WorkerThread
    public static AFf1jSDK getMonetizationNetwork() {
        if (getRevenue == null) {
            getRevenue = new AFf1jSDK();
        }
        return getRevenue;
    }

    private AFf1jSDK() {
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static String getCurrencyIso4217Code() {
        StringBuilder sb2 = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i12 <= 2) {
                        i12++;
                        sb2.append(AFa1tSDK.XPOSED.getMediationNetwork);
                        if (stackTraceElement.getMethodName().equals("main")) {
                            sb2.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb2.append("+h");
                        }
                        sb2.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i11++;
                    }
                }
            }
            if (i11 > 1) {
                sb2.append("mz;");
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", th2);
        }
        try {
            StringBuilder sb3 = new StringBuilder("/proc/");
            sb3.append(Process.myPid());
            sb3.append("/maps");
            if (AFAdRevenueData(sb3.toString(), "frida")) {
                sb2.append(AFa1tSDK.FRIDA.getMediationNetwork);
                if (Build.VERSION.SDK_INT < 29 && AFAdRevenueData("/proc/net/tcp", "69A2")) {
                    sb2.append("+prt");
                }
            }
        } catch (Exception e11) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e11);
            sb2.append(e11.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb2.append(";");
        return sb2.toString();
    }

    private AFg1dSDK getMediationNetwork() throws Throwable {
        AFg1dSDK aFg1dSDK = new AFg1dSDK();
        try {
            for (Map.Entry<String, String> entry : this.getMonetizationNetwork.entrySet()) {
                String revenue = getRevenue(entry.getValue());
                if (revenue != null && !revenue.equals("")) {
                    aFg1dSDK.AFAdRevenueData(entry.getKey(), revenue);
                }
            }
        } catch (Exception e11) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e11);
        }
        return aFg1dSDK;
    }
}
