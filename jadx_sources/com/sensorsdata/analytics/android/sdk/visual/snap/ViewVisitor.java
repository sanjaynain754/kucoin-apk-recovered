package com.sensorsdata.analytics.android.sdk.visual.snap;

import android.annotation.TargetApi;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
@TargetApi(16)
public abstract class ViewVisitor implements Pathfinder.Accumulator {
    private static final String TAG = "SA.ViewVisitor";
    private final List<Pathfinder.PathElement> mPath;
    private final Pathfinder mPathfinder = new Pathfinder();

    public abstract void cleanup();

    public abstract String name();

    public void visit(View view) {
        this.mPathfinder.findTargetsInRoot(view, this.mPath, this);
    }

    public ViewVisitor(List<Pathfinder.PathElement> list) {
        this.mPath = list;
    }
}
