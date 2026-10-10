package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.p407io.FilesKt;
import p852kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFileCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheManager.kt\ncom/appsflyer/internal/cache/FileCacheManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1855#2,2:336\n1855#2,2:339\n1855#2:341\n1856#2:344\n1855#2,2:346\n1855#2:348\n1856#2:351\n6442#3:338\n13579#3,2:349\n18#4:342\n26#5:343\n1#6:345\n*S KotlinDebug\n*F\n+ 1 FileCacheManager.kt\ncom/appsflyer/internal/cache/FileCacheManager\n*L\n106#1:336,2\n189#1:339,2\n207#1:341\n207#1:344\n263#1:346,2\n296#1:348\n296#1:351\n187#1:338\n299#1:349,2\n213#1:342\n213#1:343\n*E\n"})
public final class AFc1sSDK implements AFc1tSDK {

    @NotNull
    private final AFc1fSDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1uSDK getMediationNetwork;

    @NotNull
    private final AFc1pSDK getMonetizationNetwork;

    @NotNull
    private final Map<String, Integer> getRevenue;

    private final void getRevenue() {
        for (AFc1vSDK aFc1vSDK : this.getMediationNetwork.getRevenue) {
            String str = aFc1vSDK.AFAdRevenueData;
            Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.getRevenue;
                String str2 = aFc1vSDK.AFAdRevenueData;
                File[] fileArrListFiles = file.listFiles();
                map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            } else {
                file.mkdirs();
                this.getRevenue.put(aFc1vSDK.AFAdRevenueData, 0);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    @WorkerThread
    public final void AFAdRevenueData() {
        try {
            if (this.getMonetizationNetwork.AFAdRevenueData("AF_CACHE_VERSION", -1) == 2) {
                Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
                Intrinsics.checkNotNull(context);
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context2);
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.getMonetizationNetwork.getRevenue("AF_CACHE_VERSION", 2);
                Context context3 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context4);
                    FilesKt.deleteRecursively(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            getRevenue();
        } catch (Exception e11) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.CACHE, "Could not init cache", e11, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    @WorkerThread
    @NotNull
    public final List<AFc1rSDK> getMediationNetwork() {
        AFg1bSDK.i$default(AFLogger.INSTANCE, AFh1ySDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList<File> arrayList2 = new ArrayList();
        try {
            Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.getMediationNetwork.getRevenue.iterator();
            while (it.hasNext()) {
                String str = ((AFc1vSDK) it.next()).AFAdRevenueData;
                Context context3 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                CollectionsKt.addAll(arrayList2, fileArrListFiles);
            }
            for (File file2 : arrayList2) {
                AFg1bSDK.i$default(AFLogger.INSTANCE, AFh1ySDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1rSDK aFc1rSDKAFAdRevenueData = AFAdRevenueData(file2);
                if (aFc1rSDKAFAdRevenueData != null) {
                    arrayList.add(aFc1rSDKAFAdRevenueData);
                }
            }
        } catch (Exception e11) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.CACHE, "Could not get cached requests", e11, false, false, false, false, 120, null);
        }
        AFg1bSDK.i$default(AFLogger.INSTANCE, AFh1ySDK.CACHE, "Found " + arrayList.size() + " Cached Requests", false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    @WorkerThread
    public final void getMonetizationNetwork() {
        try {
            Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.getMediationNetwork.getRevenue.iterator();
            while (it.hasNext()) {
                String str = ((AFc1vSDK) it.next()).AFAdRevenueData;
                Context context3 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                File[] fileArrListFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (fileArrListFiles != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    for (File file : fileArrListFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFh1ySDK aFh1ySDK = AFh1ySDK.CACHE;
                        AFg1bSDK.i$default(aFLogger, aFh1ySDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFg1bSDK.i$default(aFLogger, aFh1ySDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.getCurrencyIso4217Code.getMonetizationNetwork;
            Intrinsics.checkNotNull(context4);
            FilesKt.deleteRecursively(new File(context4.getFilesDir(), "AFRequestCache"));
            getRevenue();
        } catch (Exception e11) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.CACHE, "Could not clearCache request", e11, false, false, false, false, 120, null);
        }
    }

    public AFc1sSDK(@NotNull AFc1fSDK aFc1fSDK, @NotNull AFc1pSDK aFc1pSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        this.getCurrencyIso4217Code = aFc1fSDK;
        this.getMonetizationNetwork = aFc1pSDK;
        this.getMediationNetwork = new AFc1uSDK(CollectionsKt.listOf((Object[]) new AFc1vSDK[]{new AFc1vSDK("ConversionsCache", CollectionsKt.listOf(AFe1oSDK.CONVERSION), 1), new AFc1vSDK("AttrCache", CollectionsKt.listOf(AFe1oSDK.ATTR), 1), new AFc1vSDK("OtherCache", CollectionsKt.listOf((Object[]) new AFe1oSDK[]{AFe1oSDK.LAUNCH, AFe1oSDK.INAPP, AFe1oSDK.ADREVENUE, AFe1oSDK.ARS_VALIDATE, AFe1oSDK.PURCHASE_VALIDATE, AFe1oSDK.MANUAL_PURCHASE_VALIDATION, AFe1oSDK.SDK_SERVICES}), 40)}));
        this.getRevenue = MapsKt.mutableMapOf(TuplesKt.m90091to("ConversionsCache", 0), TuplesKt.m90091to("AttrCache", 0), TuplesKt.m90091to("OtherCache", 0));
    }

    private final String getCurrencyIso4217Code(AFe1oSDK aFe1oSDK) {
        String str;
        AFc1vSDK mediationNetwork = getMediationNetwork(aFe1oSDK);
        if (mediationNetwork != null && (str = mediationNetwork.AFAdRevenueData) != null) {
            return str;
        }
        throw new UnsupportedOperationException("Cache do not support this type of events");
    }

    private final boolean getRevenue(File file) {
        try {
            file.delete();
            getRevenue();
            return true;
        } catch (Exception e11) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.CACHE, "Could not delete " + file.getName() + " from cache", e11, false, false, false, false, 120, null);
            return false;
        }
    }

    private static AFc1rSDK AFAdRevenueData(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1rSDK aFc1rSDK = new AFc1rSDK(cArr);
                aFc1rSDK.getMediationNetwork = file.getName();
                CloseableKt.closeFinally(inputStreamReader, null);
                return aFc1rSDK;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(inputStreamReader, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            AFLogger.INSTANCE.mo5915e(AFh1ySDK.CACHE, "Error while loading request from cache", e11, false, false, true, false);
            return null;
        }
    }

    private final AFc1vSDK getMediationNetwork(AFe1oSDK aFe1oSDK) {
        Object next;
        Iterator<T> it = this.getMediationNetwork.getRevenue.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AFc1vSDK) next).getMonetizationNetwork.contains(aFe1oSDK)) {
                return (AFc1vSDK) next;
            }
        }
        next = null;
        return (AFc1vSDK) next;
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    @WorkerThread
    public final boolean getMonetizationNetwork(@Nullable String str) {
        if (str == null) {
            return false;
        }
        Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
        Intrinsics.checkNotNull(context);
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
            Intrinsics.checkNotNull(context2);
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFg1bSDK.i$default(AFLogger.INSTANCE, AFh1ySDK.CACHE, "Deleting " + str + " from cache", false, 4, null);
        Iterator<T> it = this.getMediationNetwork.getRevenue.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1vSDK) it.next()).AFAdRevenueData;
            Context context3 = this.getCurrencyIso4217Code.getMonetizationNetwork;
            Intrinsics.checkNotNull(context3);
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return getRevenue(file);
            }
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    @WorkerThread
    @Nullable
    public final String AFAdRevenueData(@NotNull AFc1rSDK aFc1rSDK) {
        Exception exc;
        File file;
        String str;
        List listSortedWith;
        List<File> listTake;
        Intrinsics.checkNotNullParameter(aFc1rSDK, "");
        try {
            AFe1oSDK aFe1oSDK = aFc1rSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(aFe1oSDK, "");
            Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), getCurrencyIso4217Code(aFe1oSDK));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK aFh1ySDK = AFh1ySDK.CACHE;
            AFg1bSDK.i$default(aFLogger, aFh1ySDK, "Caching request with URL: " + aFc1rSDK.getCurrencyIso4217Code, false, 4, null);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, strValueOf);
            try {
                file.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFc1rSDK.getMonetizationNetwork);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFc1rSDK.getCurrencyIso4217Code);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFc1rSDK.getRevenue(), 2));
                    outputStreamWriter.write(10);
                    AFe1oSDK aFe1oSDK2 = aFc1rSDK.AFAdRevenueData;
                    outputStreamWriter.write("type=");
                    outputStreamWriter.write(aFe1oSDK2.name());
                    outputStreamWriter.write(10);
                    Map<String, String> map = aFc1rSDK.getRevenue;
                    if (map != null && !map.isEmpty()) {
                        outputStreamWriter.write("headers=");
                        Map<String, String> map2 = aFc1rSDK.getRevenue;
                        Intrinsics.checkNotNull(map2, "");
                        String string = new JSONObject(map2).toString();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        byte[] bytes = string.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "");
                        outputStreamWriter.write(Base64.encodeToString(bytes, 2));
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(outputStreamWriter, null);
                    AFg1bSDK.i$default(aFLogger, aFh1ySDK, "Cache request: done, cacheKey: " + strValueOf, false, 4, null);
                    AFe1oSDK aFe1oSDK3 = aFc1rSDK.AFAdRevenueData;
                    Intrinsics.checkNotNullExpressionValue(aFe1oSDK3, "");
                    AFc1vSDK mediationNetwork = getMediationNetwork(aFe1oSDK3);
                    Integer numValueOf = mediationNetwork != null ? Integer.valueOf(mediationNetwork.getCurrencyIso4217Code) : null;
                    if (numValueOf == null) {
                        return strValueOf;
                    }
                    int iIntValue = numValueOf.intValue();
                    Map<String, Integer> map3 = this.getRevenue;
                    AFc1vSDK mediationNetwork2 = getMediationNetwork(aFe1oSDK3);
                    if (mediationNetwork2 != null && (str = mediationNetwork2.AFAdRevenueData) != null) {
                        Integer num = map3.get(str);
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        if (iIntValue2 >= iIntValue) {
                            int i11 = (iIntValue2 + 1) - iIntValue;
                            AFg1bSDK.i$default(aFLogger, aFh1ySDK, "Cache overflown for type " + aFe1oSDK3 + ", removing " + i11 + " item(s)", false, 4, null);
                            Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                            Intrinsics.checkNotNull(context2);
                            File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), getCurrencyIso4217Code(aFe1oSDK3));
                            if (!file3.exists()) {
                                file3.mkdirs();
                            }
                            File[] fileArrListFiles = file3.listFiles();
                            if (fileArrListFiles != null && (listSortedWith = ArraysKt.sortedWith(fileArrListFiles, new Comparator() { // from class: com.appsflyer.internal.AFc1sSDK.5
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t11, T t12) {
                                    return ComparisonsKt.compareValues(((File) t11).getName(), ((File) t12).getName());
                                }
                            })) != null && (listTake = CollectionsKt.take(listSortedWith, i11)) != null) {
                                for (File file4 : listTake) {
                                    file4.delete();
                                    AFg1bSDK.i$default(AFLogger.INSTANCE, AFh1ySDK.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                                }
                            }
                        }
                        getRevenue();
                        return strValueOf;
                    }
                    throw new UnsupportedOperationException("Cache do not support this type of events");
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(outputStreamWriter, th2);
                        throw th3;
                    }
                }
            } catch (Exception e11) {
                exc = e11;
                if (file != null) {
                    file.delete();
                }
                AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                return null;
            }
        } catch (Exception e12) {
            exc = e12;
            file = null;
        }
    }
}
