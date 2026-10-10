package com.kubi.core.spot.business.holder.intercept.taskchain;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;
import p557qe.C43719a;
import p557qe.InterfaceC43720b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TaskChainEngine.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u000fB!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eR \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskChainEngine;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LONGITUDE_EAST, "", "ruleList", "Ljava/util/LinkedList;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "<init>", "(Ljava/util/LinkedList;)V", "dispatcher", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/DefaultTaskDispatcher;", "execute", "", "data", "(Ljava/lang/Object;)V", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TaskChainEngine<T, E> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f21136c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LinkedList<InterfaceC43720b<T, E>> f21137a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C43719a<T, E> f21138b;

    /* JADX INFO: compiled from: TaskChainEngine.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0002\u0010\u0006\"\u0004\b\u0003\u0010\u00072\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\n0\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskChainEngine$Companion;", "", "<init>", "()V", "buildTaskChain", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskChainEngine;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LONGITUDE_EAST, "ruleList", "Ljava/util/LinkedList;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final <T, E> TaskChainEngine<T, E> buildTaskChain(@NotNull LinkedList<InterfaceC43720b<T, E>> ruleList) {
            Intrinsics.checkNotNullParameter(ruleList, "ruleList");
            return new TaskChainEngine<>(ruleList);
        }
    }

    public TaskChainEngine(@NotNull LinkedList<InterfaceC43720b<T, E>> ruleList) {
        Intrinsics.checkNotNullParameter(ruleList, "ruleList");
        this.f21137a = ruleList;
        this.f21138b = new C43719a<>(ruleList);
    }

    /* JADX INFO: renamed from: a */
    public final void m23280a(T t11) {
        InterfaceC43720b interfaceC43720b = (InterfaceC43720b) CollectionsKt.removeFirstOrNull(this.f21137a);
        if (interfaceC43720b == null) {
            return;
        }
        interfaceC43720b.mo23276c(t11, this.f21138b);
    }
}
