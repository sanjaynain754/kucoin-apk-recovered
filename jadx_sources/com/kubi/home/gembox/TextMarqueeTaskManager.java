package com.kubi.home.gembox;

import android.content.Context;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058cj.C4988a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.gembox.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TextMarqueeTaskManager.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\nH\u0002J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u0004\u0018\u00010\f*\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/home/gembox/TextMarqueeTaskManager;", "", "context", "Landroid/content/Context;", "marqueeView", "Lcom/kubi/home/gembox/MarqueeView;", "<init>", "(Landroid/content/Context;Lcom/kubi/home/gembox/MarqueeView;)V", "textItemList", "", "Lcom/kubi/home/gembox/TextItem;", "marqueeTask", "Lcom/kubi/home/gembox/ScrollTextMarqueeTask;", "isDestroy", "", "setData", "", "next", "textItem", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "pause", "resume", InterfaceC33730j9.f70350a, "start", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TextMarqueeTaskManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f25699a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final MarqueeView f25700b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public List<TextItem> f25701c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public ScrollTextMarqueeTask f25702d;

    /* JADX INFO: renamed from: e */
    public boolean f25703e;

    public TextMarqueeTaskManager(@NotNull Context context, @NotNull MarqueeView marqueeView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(marqueeView, "marqueeView");
        this.f25699a = context;
        this.f25700b = marqueeView;
    }

    /* JADX INFO: renamed from: b */
    public final void m29261b() {
        if (this.f25703e) {
            return;
        }
        C4988a.m5286a("reset marquee", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC);
        this.f25703e = true;
        ScrollTextMarqueeTask scrollTextMarqueeTask = this.f25702d;
        if (scrollTextMarqueeTask != null) {
            scrollTextMarqueeTask.m29242c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final TextItem m29262c(TextItem textItem) {
        List<TextItem> list = this.f25701c;
        int size = list != null ? list.size() : 0;
        if (size != 0) {
            int index = textItem.getIndex() + 1;
            int i11 = index < size ? index : 0;
            C4988a.m5286a("next task nextIndex:" + i11, "marquee");
            List<TextItem> list2 = this.f25701c;
            if (list2 != null) {
                return list2.get(i11);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m29263d() {
        C4988a.m5286a("pause marquee", "marquee");
        ScrollTextMarqueeTask scrollTextMarqueeTask = this.f25702d;
        if (scrollTextMarqueeTask != null) {
            scrollTextMarqueeTask.m29243d();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m29264e() {
        C4988a.m5286a("resume marquee", "marquee");
        ScrollTextMarqueeTask scrollTextMarqueeTask = this.f25702d;
        if (scrollTextMarqueeTask != null) {
            scrollTextMarqueeTask.m29244e();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m29265f(@NotNull List<TextItem> textItemList) {
        TextItem textItem;
        Intrinsics.checkNotNullParameter(textItemList, "textItemList");
        C4988a.m5286a("setData:size:" + textItemList.size(), "marquee");
        this.f25701c = textItemList;
        if (textItemList.isEmpty() || (textItem = (TextItem) CollectionsKt.firstOrNull(CollectionsKt.toList(textItemList))) == null) {
            return;
        }
        m29266g(textItem);
    }

    /* JADX INFO: renamed from: g */
    public final ScrollTextMarqueeTask m29266g(final TextItem textItem) {
        C4988a.m5286a("startMarquee text:" + ((Object) textItem.getMessage()) + " isDestroy:" + this.f25703e, "marquee");
        if (this.f25703e) {
            return null;
        }
        ScrollTextMarqueeTask scrollTextMarqueeTaskM29245f = new ScrollTextMarqueeTask(this.f25699a, textItem, this.f25700b).m29245f(new Function0() { // from class: com.kubi.home.gembox.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextMarqueeTaskManager.m29260h(this.f25697b, textItem);
            }
        });
        this.f25702d = scrollTextMarqueeTaskM29245f;
        return scrollTextMarqueeTaskM29245f;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m29260h(TextMarqueeTaskManager textMarqueeTaskManager, TextItem textItem) {
        TextItem textItemM29262c = textMarqueeTaskManager.m29262c(textItem);
        if (textItemM29262c != null) {
            textMarqueeTaskManager.m29266g(textItemM29262c);
        }
        return Unit.INSTANCE;
    }
}
