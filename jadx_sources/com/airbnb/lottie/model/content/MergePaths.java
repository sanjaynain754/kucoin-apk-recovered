package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p218e1.C37032l;
import p218e1.InterfaceC37023c;
import p355j1.InterfaceC40200c;
import p484o1.C42924f;

/* JADX INFO: loaded from: classes.dex */
public class MergePaths implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final String f6055a;

    /* JADX INFO: renamed from: b */
    public final MergePathsMode f6056b;

    /* JADX INFO: renamed from: c */
    public final boolean f6057c;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i11) {
            if (i11 == 1) {
                return MERGE;
            }
            if (i11 == 2) {
                return ADD;
            }
            if (i11 == 3) {
                return SUBTRACT;
            }
            if (i11 != 4) {
                return i11 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    /* JADX INFO: renamed from: b */
    public MergePathsMode m5693b() {
        return this.f6056b;
    }

    /* JADX INFO: renamed from: c */
    public String m5694c() {
        return this.f6055a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m5695d() {
        return this.f6057c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f6056b + '}';
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z11) {
        this.f6055a = str;
        this.f6056b = mergePathsMode;
        this.f6057c = z11;
    }

    @Override // p355j1.InterfaceC40200c
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        if (!lottieDrawable.m5553C()) {
            C42924f.m94158c("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new C37032l(this);
    }
}
