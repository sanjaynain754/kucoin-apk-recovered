package com.kubi.utils.extensions.core;

import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecyclerViewExt.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/utils/extensions/core/RecyclerViewExtKt$bindData$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "convert", "(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RecyclerViewExtKt$bindData$1 extends BaseQuickAdapter<Object, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Function2<BaseViewHolder, Object, Unit> f54320i;

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, Object item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f54320i.invoke(helper, item);
    }
}
