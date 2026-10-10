package com.kubi.home.gembox;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: DisableRtlLinearLayoutManager.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/gembox/DisableRtlLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isLayoutRTL", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DisableRtlLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public boolean isLayoutRTL() {
        return false;
    }

    public DisableRtlLinearLayoutManager(@Nullable Context context) {
        super(context);
    }
}
