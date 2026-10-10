package com.kubi.home.rank.impl;

import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import dj.C36719d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.home.rank.impl.y */
/* JADX INFO: compiled from: RankWidget.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/home/rank/impl/RankWidget$initViewPager$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrolled", "", ViewProps.POSITION, "", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onPageScrollStateChanged", "state", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankWidget.kt\ncom/kubi/home/rank/impl/RankWidget$initViewPager$2\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,495:1\n58#2,2:496\n*S KotlinDebug\n*F\n+ 1 RankWidget.kt\ncom/kubi/home/rank/impl/RankWidget$initViewPager$2\n*L\n421#1:496,2\n*E\n"})
public final class C14800y implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RankWidget f26084b;

    public C14800y(RankWidget rankWidget) {
        this.f26084b = rankWidget;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        RankWidget rankWidget = this.f26084b;
        RankWidget.m30008s(rankWidget, rankWidget.m30022p(position), false, 2, null);
        C46392a.m102329l(C36719d.f79632a.m82272q(), position);
        this.f26084b.m30011A();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }
}
