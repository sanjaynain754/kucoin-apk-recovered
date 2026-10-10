package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.FacebookException;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.tencent.bugly.proguard.C33577c3;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p333i6.C38442a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AttributionIdentifiers.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001e\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR(\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u000fR$\u0010\u0019\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001f"}, m90084d2 = {"Lcom/facebook/internal/AttributionIdentifiers;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "androidAdvertiserIdValue", "", "b", "J", "fetchTime", "<set-?>", "c", "j", "()Ljava/lang/String;", "attributionId", "d", "i", "androidInstallerPackage", "", "e", "Z", "k", "()Z", "isTrackingLimited", CmcdData.Factory.STREAMING_FORMAT_HLS, "androidAdvertiserId", "f", "Companion", "GoogleAdInfo", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AttributionIdentifiers {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final String f9536g = AttributionIdentifiers.class.getCanonicalName();

    /* JADX INFO: renamed from: h */
    @JvmField
    @Nullable
    public static AttributionIdentifiers f9537h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String androidAdvertiserIdValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long fetchTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String attributionId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String androidInstallerPackage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isTrackingLimited;

    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00138\u0000X\u0081T¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0003R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u0003R\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u001c\u0010'\u001a\n &*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0017¨\u0006("}, m90084d2 = {"Lcom/facebook/internal/AttributionIdentifiers$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isTrackingLimited", "(Landroid/content/Context;)Z", "Lcom/facebook/internal/AttributionIdentifiers;", "getAttributionIdentifiers", "(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;", "b", "c", "f", "d", "identifiers", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/internal/AttributionIdentifiers;)Lcom/facebook/internal/AttributionIdentifiers;", "", "e", "(Landroid/content/Context;)Ljava/lang/String;", "ATTRIBUTION_ID_CONTENT_PROVIDER", "Ljava/lang/String;", "getATTRIBUTION_ID_CONTENT_PROVIDER$facebook_core_release$annotations", "cachedIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "getCachedIdentifiers$facebook_core_release$annotations", "ANDROID_ID_COLUMN_NAME", "ATTRIBUTION_ID_COLUMN_NAME", "ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI", "", "CONNECTION_RESULT_SUCCESS", "I", "", "IDENTIFIER_REFRESH_INTERVAL_MILLIS", "J", "LIMIT_TRACKING_COLUMN_NAME", "kotlin.jvm.PlatformType", "TAG", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final AttributionIdentifiers m9912c(Context context) {
            Method methodM10048K;
            Object objM10051S;
            try {
                if (!m9915f(context) || (methodM10048K = C5760c.m10048K("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (objM10051S = C5760c.m10051S(null, methodM10048K, context)) == null) {
                    return null;
                }
                Method methodM10047J = C5760c.m10047J(objM10051S.getClass(), "getId", new Class[0]);
                Method methodM10047J2 = C5760c.m10047J(objM10051S.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (methodM10047J != null && methodM10047J2 != null) {
                    AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                    attributionIdentifiers.androidAdvertiserIdValue = (String) C5760c.m10051S(objM10051S, methodM10047J, new Object[0]);
                    Boolean bool = (Boolean) C5760c.m10051S(objM10051S, methodM10047J2, new Object[0]);
                    attributionIdentifiers.isTrackingLimited = bool != null ? bool.booleanValue() : false;
                    return attributionIdentifiers;
                }
                return null;
            } catch (Exception e11) {
                C5760c.m10063d0("android_id", e11);
                return null;
            }
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: f */
        public final boolean m9915f(Context context) {
            Method methodM10048K = C5760c.m10048K("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodM10048K == null) {
                return false;
            }
            Object objM10051S = C5760c.m10051S(null, methodM10048K, context);
            return (objM10051S instanceof Integer) && Intrinsics.areEqual(objM10051S, (Object) 0);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x006e A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #5 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0064, B:25:0x0084, B:27:0x008a, B:29:0x008f, B:31:0x0094, B:21:0x006e, B:23:0x007c, B:53:0x00f2, B:54:0x00f9), top: B:66:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x007c A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #5 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0064, B:25:0x0084, B:27:0x008a, B:29:0x008f, B:31:0x0094, B:21:0x006e, B:23:0x007c, B:53:0x00f2, B:54:0x00f9), top: B:66:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x011d  */
        /* JADX WARN: Code duplicated, block: B:68:? A[SYNTHETIC] */
        @JvmStatic
        @Nullable
        public final AttributionIdentifiers getAttributionIdentifiers(@NotNull Context context) {
            Exception exc;
            Cursor cursor;
            Throwable th2;
            Uri uri;
            String str;
            Uri uri2;
            Intrinsics.checkNotNullParameter(context, "context");
            AttributionIdentifiers attributionIdentifiersM9911b = m9911b(context);
            Cursor cursor2 = null;
            try {
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                }
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.f9537h;
                if (attributionIdentifiers != null && System.currentTimeMillis() - attributionIdentifiers.fetchTime < FundingRateEntity.MILLIS_PER_HOUR) {
                    return attributionIdentifiers;
                }
                String[] strArr = {"aid", C33577c3.f69336J, "limit_tracking"};
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                if (providerInfoResolveContentProvider != null) {
                    String str2 = providerInfoResolveContentProvider.packageName;
                    Intrinsics.checkNotNullExpressionValue(str2, "contentProviderInfo.packageName");
                    if (C38442a.m86707a(context, str2)) {
                        uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                    } else {
                        if (providerInfoResolveContentProvider2 != null) {
                            str = providerInfoResolveContentProvider2.packageName;
                            Intrinsics.checkNotNullExpressionValue(str, "wakizashiProviderInfo.packageName");
                            if (C38442a.m86707a(context, str)) {
                                uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            }
                        }
                        uri = null;
                    }
                    uri = uri2;
                } else {
                    if (providerInfoResolveContentProvider2 != null) {
                        str = providerInfoResolveContentProvider2.packageName;
                        Intrinsics.checkNotNullExpressionValue(str, "wakizashiProviderInfo.packageName");
                        if (C38442a.m86707a(context, str)) {
                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            uri = uri2;
                        }
                    }
                    uri = null;
                }
                String strM9914e = m9914e(context);
                if (strM9914e != null) {
                    attributionIdentifiersM9911b.androidInstallerPackage = strM9914e;
                }
                if (uri == null) {
                    return m9910a(attributionIdentifiersM9911b);
                }
                Cursor cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("aid");
                            int columnIndex2 = cursorQuery.getColumnIndex(C33577c3.f69336J);
                            int columnIndex3 = cursorQuery.getColumnIndex("limit_tracking");
                            attributionIdentifiersM9911b.attributionId = cursorQuery.getString(columnIndex);
                            if (columnIndex2 > 0 && columnIndex3 > 0 && attributionIdentifiersM9911b.m9905h() == null) {
                                attributionIdentifiersM9911b.androidAdvertiserIdValue = cursorQuery.getString(columnIndex2);
                                attributionIdentifiersM9911b.isTrackingLimited = Boolean.parseBoolean(cursorQuery.getString(columnIndex3));
                            }
                            cursorQuery.close();
                            return m9910a(attributionIdentifiersM9911b);
                        }
                    } catch (Exception e11) {
                        cursor = cursorQuery;
                        exc = e11;
                        try {
                            C5760c.m10065e0(AttributionIdentifiers.f9536g, "Caught unexpected exception in getAttributionId(): " + exc);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th3) {
                            th2 = th3;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                throw th2;
                            }
                            cursor2.close();
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor2 = cursorQuery;
                        th2 = th;
                        if (cursor2 != null) {
                            throw th2;
                        }
                        cursor2.close();
                        throw th2;
                    }
                }
                AttributionIdentifiers attributionIdentifiersM9910a = m9910a(attributionIdentifiersM9911b);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return attributionIdentifiersM9910a;
            } catch (Exception e12) {
                exc = e12;
                cursor = null;
            } catch (Throwable th5) {
                th = th5;
            }
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean isTrackingLimited(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AttributionIdentifiers attributionIdentifiers = getAttributionIdentifiers(context);
            return attributionIdentifiers != null && attributionIdentifiers.getIsTrackingLimited();
        }

        /* JADX INFO: renamed from: a */
        public final AttributionIdentifiers m9910a(AttributionIdentifiers identifiers) {
            identifiers.fetchTime = System.currentTimeMillis();
            AttributionIdentifiers.f9537h = identifiers;
            return identifiers;
        }

        /* JADX INFO: renamed from: b */
        public final AttributionIdentifiers m9911b(Context context) {
            AttributionIdentifiers attributionIdentifiersM9912c = m9912c(context);
            if (attributionIdentifiersM9912c == null) {
                AttributionIdentifiers attributionIdentifiersM9913d = m9913d(context);
                if (attributionIdentifiersM9913d == null) {
                    return new AttributionIdentifiers();
                }
                return attributionIdentifiersM9913d;
            }
            return attributionIdentifiersM9912c;
        }

        /* JADX INFO: renamed from: d */
        public final AttributionIdentifiers m9913d(Context context) {
            if (!m9915f(context)) {
                return null;
            }
            ServiceConnectionC5745a serviceConnectionC5745a = new ServiceConnectionC5745a();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, serviceConnectionC5745a, 1)) {
                        GoogleAdInfo googleAdInfo = new GoogleAdInfo(serviceConnectionC5745a.m9918a());
                        AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                        attributionIdentifiers.androidAdvertiserIdValue = googleAdInfo.m9916b();
                        attributionIdentifiers.isTrackingLimited = googleAdInfo.m9917c();
                        return attributionIdentifiers;
                    }
                } catch (Exception e11) {
                    C5760c.m10063d0("android_id", e11);
                } finally {
                    context.unbindService(serviceConnectionC5745a);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final String m9914e(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        @VisibleForTesting(otherwise = 2)
        /* JADX INFO: renamed from: getATTRIBUTION_ID_CONTENT_PROVIDER$facebook_core_release$annotations */
        public static /* synthetic */ void m9909xdcc20fa1() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getCachedIdentifiers$facebook_core_release$annotations() {
        }
    }

    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;", "Landroid/os/IInterface;", "Landroid/os/IBinder;", "binder", "<init>", "(Landroid/os/IBinder;)V", "asBinder", "()Landroid/os/IBinder;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/os/IBinder;", "", "b", "()Ljava/lang/String;", "advertiserId", "", "c", "()Z", "isTrackingLimited", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class GoogleAdInfo implements IInterface {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final IBinder binder;

        public GoogleAdInfo(@NotNull IBinder binder) {
            Intrinsics.checkNotNullParameter(binder, "binder");
            this.binder = binder;
        }

        @Override // android.os.IInterface
        @NotNull
        public IBinder asBinder() {
            return this.binder;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final String m9916b() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        /* JADX INFO: renamed from: c */
        public final boolean m9917c() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z11 = true;
                parcelObtain.writeInt(1);
                this.binder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z11 = false;
                }
                return z11;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.AttributionIdentifiers$a */
    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lcom/facebook/internal/AttributionIdentifiers$a;", "Landroid/content/ServiceConnection;", "<init>", "()V", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "consumed", "Ljava/util/concurrent/BlockingQueue;", "c", "Ljava/util/concurrent/BlockingQueue;", "queue", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Landroid/os/IBinder;", "binder", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAttributionIdentifiers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributionIdentifiers.kt\ncom/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1#2:313\n*E\n"})
    public static final class ServiceConnectionC5745a implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final AtomicBoolean consumed = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final BlockingQueue<IBinder> queue = new LinkedBlockingDeque();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final IBinder m9918a() throws InterruptedException {
            if (this.consumed.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            IBinder iBinderTake = this.queue.take();
            Intrinsics.checkNotNullExpressionValue(iBinderTake, "queue.take()");
            return iBinderTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
            if (service != null) {
                try {
                    this.queue.put(service);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName name) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getAndroidInstallerPackage() {
        return this.androidInstallerPackage;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getAttributionId() {
        return this.attributionId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsTrackingLimited() {
        return this.isTrackingLimited;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final String m9905h() {
        if (C5501a.m7768D() && C5501a.m7798l()) {
            return this.androidAdvertiserIdValue;
        }
        return null;
    }
}
