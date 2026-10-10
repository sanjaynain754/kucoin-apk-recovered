package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class AFc1hSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long AFAdRevenueData = 0;
    private static int component1 = 0;
    private static int component4 = 1;
    private static long getCurrencyIso4217Code;
    private static char[] getMonetizationNetwork;
    private final Context getMediationNetwork;
    private final Map<String, Object> getRevenue;

    @VisibleForTesting
    public static class AFa1zSDK {
        public static byte[] getMediationNetwork(@NonNull byte[] bArr) throws Exception {
            for (int i11 = 0; i11 < bArr.length; i11++) {
                bArr[i11] = (byte) (bArr[i11] ^ ((i11 % 2) + 42));
            }
            return bArr;
        }

        @NonNull
        public static byte[] getCurrencyIso4217Code(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }
    }

    @VisibleForTesting
    private static StringBuilder AFAdRevenueData(@NonNull String... strArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        component1 = (component4 + 29) % 128;
        for (int i11 = 0; i11 < 3; i11++) {
            arrayList.add(Integer.valueOf(strArr[i11].length()));
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < iIntValue; i12++) {
            Integer numValueOf = null;
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = component4 + 53;
                component1 = i14 % 128;
                if (i14 % 2 != 0) {
                    strArr[i13].charAt(i12);
                    throw null;
                }
                int iCharAt = strArr[i13].charAt(i12);
                if (numValueOf != null) {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
            }
            sb2.append(Integer.toHexString(numValueOf.intValue()));
        }
        component1 = (component4 + 21) % 128;
        return sb2;
    }

    /* JADX INFO: renamed from: a */
    private static void m5951a(int i11, int i12, char c11, Object[] objArr) {
        AFk1hSDK aFk1hSDK = new AFk1hSDK();
        long[] jArr = new long[i11];
        aFk1hSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i13 = aFk1hSDK.getCurrencyIso4217Code;
            if (i13 >= i11) {
                break;
            }
            $11 = ($10 + 47) % 128;
            jArr[i13] = (((long) ((char) (((long) getMonetizationNetwork[i12 + i13]) ^ (-2577524606577954075L)))) ^ (((long) i13) * ((-2577524606577954075L) ^ AFAdRevenueData))) ^ ((long) c11);
            aFk1hSDK.getCurrencyIso4217Code = i13 + 1;
        }
        char[] cArr = new char[i11];
        aFk1hSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i14 = aFk1hSDK.getCurrencyIso4217Code;
            if (i14 >= i11) {
                String str = new String(cArr);
                $10 = ($11 + 45) % 128;
                objArr[0] = str;
                return;
            } else {
                $10 = ($11 + 35) % 128;
                cArr[i14] = (char) jArr[i14];
                aFk1hSDK.getCurrencyIso4217Code = i14 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m5952b(String str, int i11, Object[] objArr) {
        int i12 = $11 + 49;
        int i13 = i12 % 128;
        $10 = i13;
        Object charArray = str;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            int i14 = i13 + 49;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        aFk1nSDK.getRevenue = i11;
        int length = cArr.length;
        long[] jArr = new long[length];
        aFk1nSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i15 = aFk1nSDK.getCurrencyIso4217Code;
            if (i15 >= cArr.length) {
                break;
            }
            jArr[i15] = (((long) cArr[i15]) ^ (((long) i15) * ((long) aFk1nSDK.getRevenue))) ^ (getCurrencyIso4217Code ^ (-4672045500807300752L));
            aFk1nSDK.getCurrencyIso4217Code = i15 + 1;
        }
        char[] cArr2 = new char[length];
        aFk1nSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i16 = aFk1nSDK.getCurrencyIso4217Code;
            if (i16 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            } else {
                cArr2[i16] = (char) jArr[i16];
                aFk1nSDK.getCurrencyIso4217Code = i16 + 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x01ce  */
    private String getCurrencyIso4217Code() {
        String string;
        int i11;
        try {
            Map<String, Object> map = this.getRevenue;
            Object[] objArr = new Object[1];
            m5951a(12 - (KeyEvent.getMaxKeyCode() >> 16), ViewConfiguration.getFadingEdgeLength() >> 16, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12972), objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getRevenue;
            Object[] objArr2 = new Object[1];
            m5952b("\uf4f1㞛爯뻋亮␢您ꌡ\uefd1⩹唍醄\udc4aᣂ孴", Color.blue(0) + 50021, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            m5951a((ViewConfiguration.getWindowTouchSlop() >> 8) + 6, 62 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (KeyEvent.getDeadChar(0, 0) + 8465), objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            m5951a('5' - AndroidCharacter.getMirror('0'), Color.rgb(0, 0, 0) + 16777284, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
            String strReplaceAll = strIntern.replaceAll(((String) objArr4[0]).intern(), "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(string3);
            sb2.append(strReplaceAll);
            String strAFAdRevenueData = AFj1dSDK.AFAdRevenueData(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("");
            sb3.append(strAFAdRevenueData.substring(0, 16));
            string = sb3.toString();
        } catch (Exception e11) {
            Object[] objArr5 = new Object[1];
            m5952b("\uf4f0ꞯ剙໖맑吐Ø데渊᪷딕怎Ც콇篭ᚁ섣続⡺\udb15瞽≓\udd1b覭\u245b탫莋㸿\uea9b蕵〔\uecb2鼗䨜\ue6ac酌䷶\uf883", 21341 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e11);
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            m5951a(44 - View.MeasureSpec.getSize(0), 73 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) Color.red(0), objArr6);
            sb4.append(((String) objArr6[0]).intern());
            sb4.append(e11);
            AFLogger.afRDLog(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("");
            Object[] objArr7 = new Object[1];
            m5952b("\uf4f5ꑁ喛ۗ똪条ჭ솣焛⋈폕荳㰲\uedba麧丞ￖꢈ", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20662, objArr7);
            sb5.append(((String) objArr7[0]).intern());
            string = sb5.toString();
        }
        String str = string;
        try {
            Context context = this.getMediationNetwork;
            Object[] objArr8 = new Object[1];
            m5951a(37 - (ViewConfiguration.getScrollBarSize() >> 8), 117 - (Process.myPid() >> 22), (char) TextUtils.getOffsetBefore("", 0), objArr8);
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            int intExtra = -2700;
            if (intentRegisterReceiver != null) {
                Object[] objArr9 = new Object[1];
                m5951a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, View.combineMeasuredStates(0, 0) + 154, (char) Color.argb(0, 0, 0, 0), objArr9);
                intExtra = intentRegisterReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
                component4 = (component1 + 65) % 128;
            }
            String str2 = this.getMediationNetwork.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                Object[] objArr10 = new Object[1];
                m5952b("\uf4ef\udfc6ꉳ", 11112 - TextUtils.lastIndexOf("", '0'), objArr10);
                if (str2.contains(((String) objArr10[0]).intern())) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
            Context context2 = this.getMediationNetwork;
            Object[] objArr11 = new Object[1];
            m5952b("\uf4e4霛㌫\udf5f筜ݨ", TextUtils.lastIndexOf("", '0') + 25578, objArr11);
            int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
            StringBuilder sb6 = new StringBuilder();
            Object[] objArr12 = new Object[1];
            m5951a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, 165 - View.MeasureSpec.getMode(0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr12);
            sb6.append(((String) objArr12[0]).intern());
            sb6.append(intExtra);
            Object[] objArr13 = new Object[1];
            m5952b("\uf4b1앾", Color.red(0) + 12689, objArr13);
            sb6.append(((String) objArr13[0]).intern());
            sb6.append(i11);
            Object[] objArr14 = new Object[1];
            m5951a(View.combineMeasuredStates(0, 0) + 2, (-16777050) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 51722), objArr14);
            sb6.append(((String) objArr14[0]).intern());
            sb6.append(size);
            Object[] objArr15 = new Object[1];
            m5952b("\uf4b1诖", 32561 - View.resolveSizeAndState(0, 0, 0), objArr15);
            sb6.append(((String) objArr15[0]).intern());
            sb6.append(this.getRevenue.size());
            String string4 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            byte[] mediationNetwork = AFa1zSDK.getMediationNetwork(AFa1zSDK.getCurrencyIso4217Code(string4));
            StringBuilder sb8 = new StringBuilder();
            component4 = (component1 + 29) % 128;
            for (byte b11 : mediationNetwork) {
                String hexString = Integer.toHexString(b11);
                if (hexString.length() == 1) {
                    int i12 = component4 + 109;
                    component1 = i12 % 128;
                    if (i12 % 2 != 0) {
                        hexString = "0".concat(hexString);
                        int i13 = 63 / 0;
                    } else {
                        hexString = "0".concat(hexString);
                    }
                }
                sb8.append(hexString);
            }
            sb7.append(sb8.toString());
            return sb7.toString();
        } catch (Exception e12) {
            Object[] objArr16 = new Object[1];
            m5951a(16 - View.MeasureSpec.getSize(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 168, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr16);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e12);
            StringBuilder sb9 = new StringBuilder();
            Object[] objArr17 = new Object[1];
            m5951a(KeyEvent.getDeadChar(0, 0) + 44, TextUtils.lastIndexOf("", '0') + 74, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr17);
            sb9.append(((String) objArr17[0]).intern());
            sb9.append(e12);
            AFLogger.afRDLog(sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str);
            Object[] objArr18 = new Object[1];
            m5952b("\uf4f1仦聤\uda64ᷢ埣ꥡ\ue361⛯磬눯\uf43f俳膮\udb78ᴵ", (ViewConfiguration.getJumpTapTimeout() >> 16) + 47681, objArr18);
            sb10.append(((String) objArr18[0]).intern());
            return sb10.toString();
        }
    }

    public static void getMediationNetwork() {
        getMonetizationNetwork = new char[]{32809, 60417, 22601, 50353, 12445, 40142, 2359, 30066, 57668, 19854, 47603, 9789, 45739, 56965, 27364, 63018, 523, 44623, 15281, 18408, 45699, 57003, 27346, 62980, 572, 44650, 15327, 18379, 54264, 32556, 35670, 5266, 41136, 52466, 22558, 58442, 28786, 40410, 10688, 46589, 49455, 27934, 65156, 2745, 38644, 8786, 20052, 55929, 26549, 62430, 8007, 43825, 14205, 16521, 60606, 30968, 33805, 4167, 48240, 51618, 21895, 57666, 37826, 65525, 19355, 55118, 9062, 36651, 45768, 57016, 27352, 63046, 627, 45699, 57003, 27346, 62980, 572, 44650, 15327, 18379, 54264, 32556, 35670, 5266, 41136, 52466, 22558, 58442, 28786, 40410, 10688, 46589, 49455, 27934, 65177, 2749, 38625, 8711, 20038, 55856, 26550, 62431, 7955, 43836, 14117, 16527, 60579, 30955, 33820, 4190, 48235, 51621, 21970, 57612, 3433, 39200, 45700, 56996, 27359, 63002, 566, 44647, 15259, 18306, 54260, 32556, 35655, 5253, 41151, 52466, 22617, 58437, 28790, 40334, 10690, 46583, 49447, 27920, 65197, 2717, 38617, 8742, 20070, 55874, 26520, 62441, 7972, 43804, 14148, 16548, 60572, 30925, 33853, 45713, 57007, 27350, 63000, 572, 44668, 15262, 18392, 54248, 32560, 35670, 45703, 30921, 5299, 45698, 57007, 27343, 63038, 619, 44632, 15262, 18368, 54248, 32551, 35603, 5253, 41123, 52468, 22552, 58454};
        AFAdRevenueData = 4920180562940649162L;
        getCurrencyIso4217Code = 2584127450055626215L;
    }

    @NonNull
    private String getMonetizationNetwork() {
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getRevenue;
            Object[] objArr = new Object[1];
            m5951a(13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Process.myPid() >> 22, (char) (View.MeasureSpec.getSize(0) + 12973), objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getRevenue;
            Object[] objArr2 = new Object[1];
            m5952b("\uf4f5噬뇤።绗", TextUtils.indexOf("", "") + 41609, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                Object[] objArr3 = new Object[1];
                m5951a(8 - (ViewConfiguration.getTapTimeout() >> 16), 12 - Drawable.resolveOpacity(0, 0), (char) TextUtils.indexOf("", "", 0), objArr3);
                string3 = ((String) objArr3[0]).intern();
                component1 = (component4 + 53) % 128;
            }
            StringBuilder sb2 = new StringBuilder(string2);
            sb2.reverse();
            StringBuilder sbAFAdRevenueData = AFAdRevenueData(string, string3, sb2.toString());
            int length = sbAFAdRevenueData.length();
            if (length > 4) {
                component1 = (component4 + 77) % 128;
                sbAFAdRevenueData.delete(4, length);
            } else {
                while (length < 4) {
                    length++;
                    sbAFAdRevenueData.append('1');
                }
            }
            Object[] objArr4 = new Object[1];
            m5952b("\uf4fc댯筋", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18396, objArr4);
            sbAFAdRevenueData.insert(0, ((String) objArr4[0]).intern());
            return sbAFAdRevenueData.toString();
        } catch (Exception e11) {
            Object[] objArr5 = new Object[1];
            m5952b("\uf4b7ᒵ㑸听痕闼땂픑\uf6c6ᛚ㙃嘁矂靺뜴탸\uf0e7ၥ〨処熖酌넘틐\uf286ቄ㏲台獰錣볧\udcecﱜᰗ㷄巘絔鴇뻝\ude7c", 57412 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e11);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            m5951a(Color.green(0) + 42, 20 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e11);
            AFLogger.afRDLog(sb3.toString());
            Object[] objArr7 = new Object[1];
            m5952b("\uf4fc\uda8dꠏ翓䵒᳕\ue254", (ViewConfiguration.getTouchSlop() >> 8) + 11903, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    static {
        getMediationNetwork();
        TypedValue.complexToFloat(0);
        Color.red(0);
        PointF.length(0.0f, 0.0f);
        SystemClock.elapsedRealtime();
        Process.getGidForName("");
        Color.alpha(0);
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getFadingEdgeLength();
        AudioTrack.getMaxVolume();
        component4 = (component1 + 33) % 128;
    }

    @WorkerThread
    public AFc1hSDK(Map<String, Object> map, Context context) {
        this.getRevenue = map;
        this.getMediationNetwork = context;
        put(getMonetizationNetwork(), getCurrencyIso4217Code());
    }
}
