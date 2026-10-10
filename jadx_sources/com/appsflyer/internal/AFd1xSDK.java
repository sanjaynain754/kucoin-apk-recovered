package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.FilesKt;

/* JADX INFO: loaded from: classes.dex */
@WorkerThread
@SourceDebugExtension({"SMAP\nExceptionManageCacheImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionManageCacheImpl.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionManageCacheImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n11653#2,9:131\n13579#2:140\n11653#2,9:141\n13579#2:150\n13580#2:152\n11662#2:153\n13580#2:155\n11662#2:156\n4117#2:158\n4217#2,2:159\n4117#2:165\n4217#2,2:166\n1#3:151\n1#3:154\n1#3:157\n1549#4:161\n1620#4,3:162\n1549#4:168\n1620#4,3:169\n*S KotlinDebug\n*F\n+ 1 ExceptionManageCacheImpl.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionManageCacheImpl\n*L\n69#1:131,9\n69#1:140\n71#1:141,9\n71#1:150\n71#1:152\n71#1:153\n69#1:155\n69#1:156\n101#1:158\n101#1:159,2\n119#1:165\n119#1:166,2\n71#1:151\n69#1:154\n101#1:161\n101#1:162,3\n120#1:168\n120#1:169,3\n*E\n"})
public final class AFd1xSDK implements AFc1cSDK {

    @NotNull
    private final AFc1fSDK AFAdRevenueData;

    private final File getMonetizationNetwork() {
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getMediationNetwork() {
        return getRevenue(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    @NotNull
    public final List<ExceptionInfo> getRevenue() {
        List<ExceptionInfo> listEmptyList;
        File[] fileArrListFiles;
        ArrayList arrayList;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                listEmptyList = null;
                if (monetizationNetwork != null && (fileArrListFiles = monetizationNetwork.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            File[] fileArrListFiles2 = file.listFiles();
                            if (fileArrListFiles2 != null) {
                                Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "");
                                arrayList = new ArrayList();
                                for (File file2 : fileArrListFiles2) {
                                    ExceptionInfo.Companion companion = ExceptionInfo.INSTANCE;
                                    Intrinsics.checkNotNullExpressionValue(file2, "");
                                    ExceptionInfo revenue = ExceptionInfo.Companion.getRevenue(FilesKt.readText$default(file2, null, 1, null));
                                    if (revenue != null) {
                                        arrayList.add(revenue);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                        } catch (Throwable th2) {
                            AFg1bSDK.v$default(AFLogger.INSTANCE, AFh1ySDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th2.getMessage(), false, 4, null);
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listEmptyList = CollectionsKt.flatten(arrayList2);
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return listEmptyList;
    }

    public AFd1xSDK(@NotNull AFc1fSDK aFc1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        this.AFAdRevenueData = aFc1fSDK;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final int AFAdRevenueData() {
        Iterator<T> it = getRevenue().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((ExceptionInfo) it.next()).counter;
        }
        return i11;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    @Nullable
    public final String getMonetizationNetwork(@NotNull Throwable th2, @NotNull String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File monetizationNetwork = getMonetizationNetwork();
            str2 = null;
            if (monetizationNetwork != null) {
                file = new File(monetizationNetwork, "6.17.4");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    ExceptionInfo revenue = AFd1tSDK.getRevenue(th2, str);
                    String str3 = revenue.hashName;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        ExceptionInfo.Companion companion = ExceptionInfo.INSTANCE;
                        ExceptionInfo revenue2 = ExceptionInfo.Companion.getRevenue(FilesKt.readText$default(file2, null, 1, null));
                        if (revenue2 != null) {
                            revenue2.counter++;
                            revenue = revenue2;
                        }
                    }
                    FilesKt.writeText$default(file2, revenue.getMediationNetwork(), null, 2, null);
                    str2 = str3;
                } catch (Exception e11) {
                    AFg1bSDK.v$default(AFLogger.INSTANCE, AFh1ySDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e11.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getRevenue(@NotNull String... strArr) {
        boolean zDeleteRecursively;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                zDeleteRecursively = true;
                if (monetizationNetwork != null) {
                    if (strArr.length == 0) {
                        AFg1bSDK.v$default(AFLogger.INSTANCE, AFh1ySDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zDeleteRecursively = FilesKt.deleteRecursively(monetizationNetwork);
                    } else {
                        AFg1bSDK.v$default(AFLogger.INSTANCE, AFh1ySDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), false, 4, null);
                        File[] fileArrListFiles = monetizationNetwork.listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!ArraysKt.contains(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                            for (File file2 : arrayList) {
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                            }
                            Set set = CollectionsKt.toSet(arrayList2);
                            if (set.isEmpty()) {
                                set = SetsKt.setOf(Boolean.TRUE);
                            }
                            if (set.size() != 1 || !((Boolean) CollectionsKt.first(set)).booleanValue()) {
                                zDeleteRecursively = false;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zDeleteRecursively;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final void getMonetizationNetwork(int i11, int i12) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                if (monetizationNetwork != null && (fileArrListFiles = monetizationNetwork.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int mediationNetwork = AFk1zSDK.getMediationNetwork(name);
                        if (i11 > mediationNetwork || mediationNetwork > i12) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
