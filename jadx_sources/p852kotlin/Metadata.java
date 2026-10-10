package p852kotlin;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.bugly.proguard.C33612dh;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;
import p852kotlin.jvm.JvmName;

/* JADX INFO: compiled from: Metadata.kt */
/* JADX INFO: loaded from: classes23.dex */
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.3")
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0096\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\u00020\u0003B\u0004\b\u0003\u0010\u0002\u0012\f\b\u0002\u0010\u0004\u001a\u00020\u0005B\u0002\b\f\u0012\u001e\b\u0002\u0010\u0006\u001a\u00020\u0005B\u0014\b\fJ\u0004\b\u0003\u0010\u0002J\u0004\b\u0003\u0010\u0000J\u0004\b\u0003\u0010\u0006\u0012\u0012\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bB\u0002\b\f\u0012\u0012\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bB\u0002\b\f\u0012\u000e\b\u0002\u0010\u000b\u001a\u00020\tB\u0004\b\b(\f\u0012\u000e\b\u0002\u0010\r\u001a\u00020\tB\u0004\b\b(\f\u0012\u000e\b\u0002\u0010\u000e\u001a\u00020\u0003B\u0004\b\u0003\u0010\u0000R\u0011\u0010\u0002\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\u00020\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u00038GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, m90084d2 = {"Lkotlin/Metadata;", "", C33612dh.f69618m, "", "metadataVersion", "", "bytecodeVersion", "data1", "", "", "data2", "extraString", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "extraInt", "k", "()I", "mv", "()[I", "bv$annotations", "()V", "bv", "d1", "()[Ljava/lang/String;", "d2", "xs", "()Ljava/lang/String;", "pn$annotations", "pn", "xi$annotations", "xi", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@p852kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface Metadata {
    @JvmName(name = "bv")
    /* JADX INFO: renamed from: bv */
    int[] m90082bv() default {1, 0, 3};

    @JvmName(name = "d1")
    /* JADX INFO: renamed from: d1 */
    String[] m90083d1() default {};

    @JvmName(name = "d2")
    /* JADX INFO: renamed from: d2 */
    String[] m90084d2() default {};

    @JvmName(name = "k")
    /* JADX INFO: renamed from: k */
    int m90085k() default 1;

    @JvmName(name = "mv")
    /* JADX INFO: renamed from: mv */
    int[] m90086mv() default {};

    @JvmName(name = "pn")
    /* JADX INFO: renamed from: pn */
    String m90087pn() default "";

    @JvmName(name = "xi")
    /* JADX INFO: renamed from: xi */
    int m90088xi() default 0;

    @JvmName(name = "xs")
    /* JADX INFO: renamed from: xs */
    String m90089xs() default "";

    /* JADX INFO: compiled from: Metadata.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.WARNING, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void bv$annotations() {
        }

        @SinceKotlin(version = "1.2")
        public static /* synthetic */ void pn$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void xi$annotations() {
        }
    }
}
