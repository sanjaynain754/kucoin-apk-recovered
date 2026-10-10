package com.kubi.mvi.p102vm;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.common.MviExKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import p734wq.C45916a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.mvi.vm.a */
/* JADX INFO: compiled from: WidgetLifecycle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u0003R$\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/mvi/vm/a;", "", "<init>", "()V", "Lcom/kubi/mvi/vm/b;", "widgetLifecycleObserver", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/mvi/vm/b;)V", "f", "e", "d", "b", "Lcom/kubi/mvi/vm/WidgetLifeEvent;", "<set-?>", "Lcom/kubi/mvi/vm/WidgetLifeEvent;", "c", "()Lcom/kubi/mvi/vm/WidgetLifeEvent;", "currentWidgetLifeEvent", "", "Ljava/util/List;", "widgetLifeList", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWidgetLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetLifecycle.kt\ncom/kubi/mvi/vm/WidgetLifecycle\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,99:1\n2634#2:100\n2634#2:120\n2634#2:122\n1#3:101\n1#3:119\n1#3:121\n1#3:123\n50#4,17:102\n*S KotlinDebug\n*F\n+ 1 WidgetLifecycle.kt\ncom/kubi/mvi/vm/WidgetLifecycle\n*L\n56#1:100\n78#1:120\n94#1:122\n56#1:101\n78#1:121\n94#1:123\n61#1:102,17\n*E\n"})
public final class C19306a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public WidgetLifeEvent currentWidgetLifeEvent = WidgetLifeEvent.IDLE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC19307b> widgetLifeList = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m42727a(@NotNull InterfaceC19307b widgetLifecycleObserver) {
        Intrinsics.checkNotNullParameter(widgetLifecycleObserver, "widgetLifecycleObserver");
        synchronized (this.widgetLifeList) {
            try {
                if (!this.widgetLifeList.contains(widgetLifecycleObserver)) {
                    this.widgetLifeList.add(widgetLifecycleObserver);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m42728b() {
        List list;
        synchronized (this.widgetLifeList) {
            this.currentWidgetLifeEvent = WidgetLifeEvent.ON_DESTROY;
            list = CollectionsKt.toList(this.widgetLifeList);
            this.widgetLifeList.clear();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC19307b) it.next()).onDestroy();
        }
        MviExKt.m42524t("widgetLifeList clear", null, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final WidgetLifeEvent getCurrentWidgetLifeEvent() {
        return this.currentWidgetLifeEvent;
    }

    /* JADX INFO: renamed from: d */
    public final void m42730d() {
        List list;
        synchronized (this.widgetLifeList) {
            this.currentWidgetLifeEvent = WidgetLifeEvent.ON_HIDE;
            list = CollectionsKt.toList(this.widgetLifeList);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC19307b) it.next()).mo42734b();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m42731e() throws Throwable {
        List<InterfaceC19307b> list;
        Object objM103844constructorimpl;
        synchronized (this.widgetLifeList) {
            this.currentWidgetLifeEvent = WidgetLifeEvent.ON_SHOW;
            list = CollectionsKt.toList(this.widgetLifeList);
        }
        for (InterfaceC19307b interfaceC19307b : list) {
            if (interfaceC19307b == null) {
                MviExKt.m42524t("WidgetLifecycleObserver 是空的", null, 2, null);
            } else {
                boolean zM42528a = C19241c.f35620a.m42528a();
                boolean z11 = !zM42528a;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC19307b.mo42733a();
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    if (zM42528a) {
                        throw thM103847exceptionOrNullimpl;
                    }
                    if (thM103847exceptionOrNullimpl instanceof CancellationException) {
                        throw thM103847exceptionOrNullimpl;
                    }
                    C44128b.m97262f("crash_issue", "crash_issue->【WidgetLifecycle 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
                }
                Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl2 != null) {
                    C45916a.m101366a(thM103847exceptionOrNullimpl2, "WidgetLifecycle");
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m42732f(@NotNull InterfaceC19307b widgetLifecycleObserver) {
        Intrinsics.checkNotNullParameter(widgetLifecycleObserver, "widgetLifecycleObserver");
        synchronized (this.widgetLifeList) {
            this.widgetLifeList.remove(widgetLifecycleObserver);
        }
    }
}
