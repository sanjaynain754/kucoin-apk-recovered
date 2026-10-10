package com.kubi.home.v2.biz.grid.utils;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.core.content.res.ResourcesCompat;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.home.R$color;
import com.kubi.home.R$font;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27040e;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p289gj.C37967a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridItemHeightHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/utils/GridItemHeightHelper;", "", "<init>", "()V", "minItemHeight", "", "maxItemHeight", "genAndSetItemHeight", "", "dataList", "", "Lcom/kubi/home/entity/GridNavigationEntity;", "spanCount", "containerWidth", "(Ljava/util/List;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "measureLines", "text", "", "textAvailableWidth", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridItemHeightHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridItemHeightHelper.kt\ncom/kubi/home/v2/biz/grid/utils/GridItemHeightHelper\n+ 2 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,75:1\n75#2:76\n77#2:81\n47#3,4:77\n*S KotlinDebug\n*F\n+ 1 GridItemHeightHelper.kt\ncom/kubi/home/v2/biz/grid/utils/GridItemHeightHelper\n*L\n38#1:76\n38#1:81\n38#1:77,4\n*E\n"})
public final class GridItemHeightHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final GridItemHeightHelper f26415a = new GridItemHeightHelper();

    /* JADX INFO: renamed from: b */
    public static final int f26416b = C27040e.m66658b(71);

    /* JADX INFO: renamed from: c */
    public static final int f26417c = C27040e.m66658b(80);

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m30636e(GridItemHeightHelper gridItemHeightHelper, List list, int i11, int i12, Continuation continuation, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = C5267e0.m6183e() - C27040e.m66658b(32);
        }
        return gridItemHeightHelper.m30637d(list, i11, i12, continuation);
    }

    /* JADX INFO: renamed from: f */
    public final int m30638f(String str, int i11) {
        C27017c c27017c = C27017c.f54310a;
        Context contextM66513b = c27017c.m66513b();
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(C27040e.m66659c(11.0f));
        textPaint.setColor(c27017c.m66512a(R$color.c_text));
        textPaint.setTypeface(ResourcesCompat.getFont(contextM66513b, R$font.regular));
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i11).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild.getLineCount();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m30637d(@NotNull List<? extends GridNavigationEntity> list, int i11, int i12, @NotNull Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b().plus(new C37967a(CoroutineExceptionHandler.INSTANCE)), new GridItemHeightHelper$genAndSetItemHeight$2(i11, i12, list, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }
}
