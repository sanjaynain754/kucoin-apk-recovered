package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.facebook.AccessToken;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMetaReferrer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetaReferrer.kt\ncom/appsflyer/internal/referrer/MetaReferrer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
public final class AFj1zSDK extends AFi1bSDK {

    @NotNull
    private final AFj1xSDK component1;

    @NotNull
    private final Runnable component3;

    @NotNull
    private final AFc1kSDK getCurrencyIso4217Code;

    @NotNull
    private final ExecutorService getMonetizationNetwork;

    @Nullable
    private String toString;

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    /* JADX INFO: loaded from: classes34.dex */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFj1xSDK.values().length];
            try {
                iArr[AFj1xSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1xSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1xSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFAdRevenueData = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1zSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull ExecutorService executorService, @NotNull AFj1xSDK aFj1xSDK, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        String str;
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1xSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i11 = AFj1rSDK.AFa1zSDK.getMediationNetwork[aFj1xSDK.ordinal()];
        if (i11 == 1) {
            str = AccessToken.DEFAULT_GRAPH_DOMAIN;
        } else if (i11 == 2) {
            str = "instagram";
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "facebook_lite";
        }
        super("app", str, aFc1kSDK, runnable);
        this.getCurrencyIso4217Code = aFc1kSDK;
        this.getMonetizationNetwork = executorService;
        this.component1 = aFj1xSDK;
        this.component3 = runnable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:72:0x0232 A[PHI: r20
      0x0232: PHI (r20v3 android.content.ContentProviderClient) = 
      (r20v2 android.content.ContentProviderClient)
      (r20v4 android.content.ContentProviderClient)
      (r20v4 android.content.ContentProviderClient)
     binds: [B:81:0x0277, B:71:0x0230, B:76:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0244  */
    /* JADX WARN: Code duplicated, block: B:80:0x0274  */
    public static final void getMediationNetwork(AFj1zSDK aFj1zSDK, Context context) {
        Throwable th2;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Cursor cursor;
        Uri uri;
        String string;
        String str;
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1zSDK.component4 = System.currentTimeMillis();
        aFj1zSDK.areAllFieldsValid = AFj1tSDK.AFa1ySDK.STARTED;
        aFj1zSDK.addObserver(new AFj1tSDK.C51842());
        String str2 = aFj1zSDK.toString;
        Intrinsics.checkNotNull(str2);
        try {
            AFj1xSDK aFj1xSDK = aFj1zSDK.component1;
            int[] iArr = AFa1uSDK.AFAdRevenueData;
            int i11 = iArr[aFj1xSDK.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (component3(context)) {
                        AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                        uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str2);
                    } else {
                        AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                        uri = null;
                    }
                } else if (getMediationNetwork(context)) {
                    AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str2);
                } else {
                    AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    uri = null;
                }
            } else if (getMonetizationNetwork(context)) {
                AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str2);
            } else {
                AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                uri = null;
            }
            if (uri != null) {
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.query(uri, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                                if (columnIndex != -1) {
                                    string = cursorQuery.getString(columnIndex);
                                } else {
                                    AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "No such column, " + aFj1zSDK.component1 + " provider", false, 4, null);
                                    string = null;
                                }
                                if (string != null) {
                                    AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Collected " + aFj1zSDK.component1 + " attribution data.", false, 4, null);
                                    Map<String, Object> map = aFj1zSDK.getMediationNetwork;
                                    Intrinsics.checkNotNullExpressionValue(map, "");
                                    map.put("response", "OK");
                                    Map<String, Object> map2 = aFj1zSDK.getMediationNetwork;
                                    Intrinsics.checkNotNullExpressionValue(map2, "");
                                    map2.put("referrer", string);
                                    int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                                    Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                                    if (lValueOf != null) {
                                        aFj1zSDK.getMediationNetwork.put("click_ts", Long.valueOf(lValueOf.longValue()));
                                    }
                                    int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                                    Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                                    if (numValueOf != null) {
                                        aFj1zSDK.getMediationNetwork.put("meta_custom", MapsKt.mutableMapOf(TuplesKt.m90091to("is_ct", Integer.valueOf(numValueOf.intValue()))));
                                    }
                                    int i12 = iArr[aFj1zSDK.component1.ordinal()];
                                    if (i12 == 1) {
                                        str = "com.facebook.katana";
                                    } else if (i12 == 2) {
                                        str = "com.instagram.android";
                                    } else {
                                        if (i12 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        str = "com.facebook.lite";
                                    }
                                    Map<String, Object> map3 = aFj1zSDK.getMediationNetwork;
                                    Intrinsics.checkNotNullExpressionValue(map3, "");
                                    map3.put("api_ver", Long.valueOf(AFj1jSDK.getCurrencyIso4217Code(context, str)));
                                    Map<String, Object> map4 = aFj1zSDK.getMediationNetwork;
                                    Intrinsics.checkNotNullExpressionValue(map4, "");
                                    map4.put("api_ver_name", AFj1jSDK.getMediationNetwork(context, str));
                                }
                                cursorQuery.close();
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } else {
                                AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            cursor = cursorQuery;
                            try {
                                AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1zSDK.component1.name() + " provider", th2, false, false, false, false, 120, null);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } catch (Throwable th4) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                                throw th4;
                            }
                        }
                    } else {
                        AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    cursor = null;
                    AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1zSDK.component1.name() + " provider", th2, false, false, false, false, 120, null);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    aFj1zSDK.getRevenue();
                    aFj1zSDK.component3.run();
                }
            }
        } catch (Throwable th6) {
            th2 = th6;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        }
        aFj1zSDK.getRevenue();
        aFj1zSDK.component3.run();
    }

    private final boolean getRevenue(Context context) {
        int i11 = AFa1uSDK.AFAdRevenueData[this.component1.ordinal()];
        if (i11 == 1) {
            return getMonetizationNetwork(context);
        }
        if (i11 == 2) {
            return getMediationNetwork(context);
        }
        if (i11 == 3) {
            return component3(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    @SuppressLint({"NewApi"})
    public final void AFAdRevenueData(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getCurrencyIso4217Code(context)) {
            this.getMonetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.r0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1zSDK.getMediationNetwork(this.f6355b, context);
                }
            });
        } else {
            this.component3.run();
        }
    }

    private static boolean component3(Context context) {
        if (context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d A[PHI: r0
      0x008d: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v13 java.lang.String), (r0v19 java.lang.String) binds: [B:14:0x003c, B:23:0x0063, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean getCurrencyIso4217Code(Context context) {
        String strRemovePrefix;
        if (!getCurrencyIso4217Code()) {
            AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.getCurrencyIso4217Code.getCurrencyIso4217Code("com.facebook.sdk.ApplicationId");
        String str = null;
        if (currencyIso4217Code != null) {
            strRemovePrefix = StringsKt.removePrefix(currencyIso4217Code, (CharSequence) "fb");
        } else {
            strRemovePrefix = null;
        }
        if (strRemovePrefix == null || strRemovePrefix.length() == 0) {
            AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            strRemovePrefix = null;
        }
        if (strRemovePrefix == null) {
            String strAFAdRevenueData = this.getCurrencyIso4217Code.AFAdRevenueData("facebook_application_id");
            if (strAFAdRevenueData != null) {
                strRemovePrefix = StringsKt.removePrefix(strAFAdRevenueData, (CharSequence) "fb");
            } else {
                strRemovePrefix = null;
            }
            if (strRemovePrefix == null || strRemovePrefix.length() == 0) {
                AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                strRemovePrefix = null;
            }
            if (strRemovePrefix == null) {
                String currencyIso4217Code2 = this.getCurrencyIso4217Code.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                if (currencyIso4217Code2 != null) {
                    strRemovePrefix = StringsKt.removePrefix(currencyIso4217Code2, (CharSequence) "fb");
                } else {
                    strRemovePrefix = null;
                }
                if (strRemovePrefix == null || strRemovePrefix.length() == 0) {
                    AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    strRemovePrefix = null;
                }
                if (strRemovePrefix != null) {
                    str = strRemovePrefix;
                }
            } else {
                str = strRemovePrefix;
            }
        } else {
            str = strRemovePrefix;
        }
        this.toString = str;
        if (str == null) {
            AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (!getRevenue(context)) {
            AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
            return false;
        }
        return true;
    }

    private static boolean getMonetizationNetwork(Context context) {
        if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) == null) {
            return false;
        }
        return true;
    }
}
