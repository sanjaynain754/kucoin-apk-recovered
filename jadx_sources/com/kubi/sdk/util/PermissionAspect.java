package com.kubi.sdk.util;

import io.reactivex.subjects.PublishSubject;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PermissionAspect.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/util/PermissionAspect;", "", "<init>", "()V", "onRequestPermissionsResult", "", "point", "Lorg/aspectj/lang/JoinPoint;", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PermissionAspect {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f48114a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final PublishSubject<Boolean> f48115b;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Throwable f48116c;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ PermissionAspect f48117d;

    /* JADX INFO: compiled from: PermissionAspect.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/util/PermissionAspect$Companion;", "", "<init>", "()V", "permissionsObservable", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getPermissionsObservable", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final PublishSubject<Boolean> getPermissionsObservable() {
            return PermissionAspect.f48115b;
        }
    }

    static {
        PublishSubject<Boolean> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        f48115b = publishSubjectCreate;
        try {
            m58338b();
        } catch (Throwable th2) {
            f48116c = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m58338b() {
        f48117d = new PermissionAspect();
    }

    /* JADX INFO: renamed from: c */
    public static PermissionAspect m58339c() {
        PermissionAspect permissionAspect = f48117d;
        if (permissionAspect != null) {
            return permissionAspect;
        }
        throw new NoAspectBoundException("com.kubi.sdk.util.PermissionAspect", f48116c);
    }

    /* JADX INFO: renamed from: d */
    public final void m58340d(@NotNull InterfaceC43175a point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        f48115b.onNext(Boolean.TRUE);
    }
}
