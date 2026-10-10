package com.kubi.resources.widget;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LtrLinearLayoutManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0007H\u0014¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/resources/widget/LtrLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "<init>", "(Landroid/content/Context;IZ)V", "isLayoutRTL", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LtrLinearLayoutManager extends LinearLayoutManager {
    public /* synthetic */ LtrLinearLayoutManager(Context context, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? 1 : i11, (i12 & 4) != 0 ? false : z11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public boolean isLayoutRTL() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LtrLinearLayoutManager(@NotNull Context context, int i11, boolean z11) {
        super(context, i11, z11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
