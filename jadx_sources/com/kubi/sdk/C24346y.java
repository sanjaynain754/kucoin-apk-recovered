package com.kubi.sdk;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.y */
/* JADX INFO: compiled from: BaseAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0002¨\u0006\f"}, m90084d2 = {"refresh", "", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "", "remove", ViewProps.POSITION, "", "change", "isEmpty", "", "LBase_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24346y {
    /* JADX INFO: renamed from: a */
    public static final boolean m59051a(@NotNull RecyclerView recyclerView) {
        List data;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        BaseAdapter baseAdapter = adapter instanceof BaseAdapter ? (BaseAdapter) adapter : null;
        if (baseAdapter == null || (data = baseAdapter.getData()) == null) {
            return true;
        }
        return data.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public static final void m59052b(@NotNull RecyclerView recyclerView, @Nullable List<Object> list) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        BaseAdapter baseAdapter = adapter instanceof BaseAdapter ? (BaseAdapter) adapter : null;
        if (baseAdapter != null) {
            baseAdapter.mo32194p(list);
        }
    }
}
