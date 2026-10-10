package p357j3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: j3.k */
/* JADX INFO: compiled from: HashUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lj3/k;", "", "<init>", "()V", "", "path", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "", "nanosTimeout", "c", "(Landroid/content/Context;Ljava/lang/Long;)Ljava/lang/String;", "Ljava/io/File;", "file", "d", "(Ljava/io/File;)Ljava/lang/String;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "[Ljava/lang/String;", "TRUSTED_CERTS", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHashUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashUtils.kt\ncom/facebook/appevents/internal/HashUtils\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,149:1\n11335#2:150\n11670#2,3:151\n*S KotlinDebug\n*F\n+ 1 HashUtils.kt\ncom/facebook/appevents/internal/HashUtils\n*L\n65#1:150\n65#1:151,3\n*E\n"})
public final class C40262k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40262k f89492a = new C40262k();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C40262k.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final String[] TRUSTED_CERTS = {"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"};

    /* JADX INFO: renamed from: j3.k$a */
    /* JADX INFO: compiled from: HashUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"j3/k$a", "Ljava/lang/reflect/InvocationHandler;", "", "o", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "", "objects", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f89495a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.ObjectRef<String> f89496b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ReentrantLock f89497c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Condition f89498d;

        public a(Object obj, Ref.ObjectRef<String> objectRef, ReentrantLock reentrantLock, Condition condition) {
            this.f89495a = obj;
            this.f89496b = objectRef;
            this.f89497c = reentrantLock;
            this.f89498d = condition;
        }

        /* JADX WARN: Type inference failed for: r8v10, types: [T, java.lang.String] */
        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@Nullable Object o11, @NotNull Method method, @NotNull Object[] objects) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(objects, "objects");
            try {
                if (Intrinsics.areEqual(method.getName(), "onChecksumsReady") && objects.length == 1) {
                    Object obj = objects[0];
                    if (obj instanceof List) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        for (Object obj2 : (List) obj) {
                            if (obj2 != null) {
                                Method method2 = obj2.getClass().getMethod("getSplitName", new Class[0]);
                                Intrinsics.checkNotNullExpressionValue(method2, "c.javaClass.getMethod(\"getSplitName\")");
                                Method method3 = obj2.getClass().getMethod("getType", new Class[0]);
                                Intrinsics.checkNotNullExpressionValue(method3, "c.javaClass.getMethod(\"getType\")");
                                if (method2.invoke(obj2, new Object[0]) == null && Intrinsics.areEqual(method3.invoke(obj2, new Object[0]), this.f89495a)) {
                                    Method method4 = obj2.getClass().getMethod("getValue", new Class[0]);
                                    Intrinsics.checkNotNullExpressionValue(method4, "c.javaClass.getMethod(\"getValue\")");
                                    Object objInvoke = method4.invoke(obj2, new Object[0]);
                                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                                    this.f89496b.element = new BigInteger(1, (byte[]) objInvoke).toString(16);
                                    this.f89497c.lock();
                                    try {
                                        this.f89498d.signalAll();
                                        return null;
                                    } finally {
                                        this.f89497c.unlock();
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                Log.d(C40262k.TAG, "Can't fetch checksum.", th2);
            }
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m88633b(@Nullable String path) throws Exception {
        return f89492a.m88635d(new File(path));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m88634c(@NotNull Context context, @Nullable Long nanosTimeout) throws CertificateException {
        Intrinsics.checkNotNullParameter(context, "context");
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        String[] strArr = TRUSTED_CERTS;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(Base64.decode(str, 0))));
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            Field field = Class.forName("android.content.pm.Checksum").getField("TYPE_WHOLE_MD5");
            Intrinsics.checkNotNullExpressionValue(field, "checksumClass.getField(\"TYPE_WHOLE_MD5\")");
            Object obj = field.get(null);
            Class<?> cls = Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
            Object objNewProxyInstance = Proxy.newProxyInstance(C40262k.class.getClassLoader(), new Class[]{cls}, new a(obj, objectRef, reentrantLock, conditionNewCondition));
            Intrinsics.checkNotNullExpressionValue(objNewProxyInstance, "resultChecksum: String? …       }\n              })");
            Method method = PackageManager.class.getMethod("requestChecksums", String.class, Boolean.TYPE, Integer.TYPE, List.class, cls);
            Intrinsics.checkNotNullExpressionValue(method, "PackageManager::class\n  …ecksumReadyListenerClass)");
            method.invoke(context.getPackageManager(), context.getPackageName(), Boolean.FALSE, obj, CollectionsKt.toMutableList((Collection) mutableList), objNewProxyInstance);
            if (nanosTimeout == null) {
                conditionNewCondition.await();
            } else {
                conditionNewCondition.awaitNanos(nanosTimeout.longValue());
            }
            String str2 = (String) objectRef.element;
            reentrantLock.unlock();
            return str2;
        } catch (Throwable unused) {
            reentrantLock.unlock();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m88635d(File file) throws Exception {
        int i11;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 1024);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            do {
                i11 = bufferedInputStream.read(bArr);
                if (i11 > 0) {
                    messageDigest.update(bArr, 0, i11);
                }
            } while (i11 != -1);
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            Intrinsics.checkNotNullExpressionValue(string, "BigInteger(1, md.digest()).toString(16)");
            CloseableKt.closeFinally(bufferedInputStream, null);
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedInputStream, th2);
                throw th3;
            }
        }
    }
}
