package com.kubi.utils;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.z */
/* JADX INFO: compiled from: InnerPagerAdapter.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f\"\u0004\b\u001d\u0010 ¨\u0006!"}, m90084d2 = {"Lcom/kubi/utils/z;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "Landroidx/fragment/app/FragmentManager;", "fm", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "fragments", "", "", "titles", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Ljava/util/List;)V", "", "getCount", "()I", ViewProps.POSITION, "getPageTitle", "(I)Ljava/lang/CharSequence;", "getItem", "(I)Landroidx/fragment/app/Fragment;", "", "object", "getItemPosition", "(Ljava/lang/Object;)I", "Landroid/os/Parcelable;", "saveState", "()Landroid/os/Parcelable;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/ArrayList;", "b", "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27103z extends FragmentStatePagerAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<? extends Fragment> fragments;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<? extends CharSequence> titles;

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27103z(@NotNull FragmentManager fm2, @NotNull ArrayList<? extends Fragment> fragments, @NotNull List<? extends CharSequence> titles) {
        super(fm2);
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        Intrinsics.checkNotNullParameter(titles, "titles");
        this.fragments = fragments;
        this.titles = titles;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<CharSequence> m66939a() {
        return this.titles;
    }

    /* JADX INFO: renamed from: b */
    public final void m66940b(@NotNull List<? extends CharSequence> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.titles = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.fragments.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    @NotNull
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public CharSequence getPageTitle(int position) {
        return this.titles.get(position);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NotNull Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        return -2;
    }
}
