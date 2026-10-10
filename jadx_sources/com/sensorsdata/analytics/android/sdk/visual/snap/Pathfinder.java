package com.sensorsdata.analytics.android.sdk.visual.snap;

import android.view.View;
import android.view.ViewGroup;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class Pathfinder {
    private static final String TAG = "SA.PathFinder";
    private final IntStack mIndexStack = new IntStack();

    public interface Accumulator {
        void accumulate(View view);
    }

    public static class IntStack {
        private static final int MAX_INDEX_STACK_SIZE = 256;
        private final int[] mStack = new int[256];
        private int mStackSize = 0;

        public int alloc() {
            int i11 = this.mStackSize;
            this.mStackSize = i11 + 1;
            this.mStack[i11] = 0;
            return i11;
        }

        public void free() {
            int i11 = this.mStackSize - 1;
            this.mStackSize = i11;
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(this.mStackSize);
            }
        }

        public boolean full() {
            return this.mStack.length == this.mStackSize;
        }

        public void increment(int i11) {
            int[] iArr = this.mStack;
            iArr[i11] = iArr[i11] + 1;
        }

        public int read(int i11) {
            return this.mStack[i11];
        }
    }

    public static class PathElement {
        public static final int SHORTEST_PREFIX = 1;
        public static final int ZERO_LENGTH_PREFIX = 0;
        public final int index;
        public final int prefix;
        public final String viewClassName;
        public final int viewId;

        public String toString() {
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.prefix == 1) {
                    jSONObject.put("prefix", "shortest");
                }
                String str = this.viewClassName;
                if (str != null) {
                    jSONObject.put("view_class", str);
                }
                int i11 = this.index;
                if (i11 > -1) {
                    jSONObject.put("index", i11);
                }
                int i12 = this.viewId;
                if (i12 > -1) {
                    jSONObject.put("id", i12);
                }
                return jSONObject.toString();
            } catch (JSONException e11) {
                throw new RuntimeException("Can't serialize PathElement to String", e11);
            }
        }

        public PathElement(int i11, String str, int i12, int i13) {
            this.prefix = i11;
            this.viewClassName = str;
            this.index = i12;
            this.viewId = i13;
        }
    }

    private View findPrefixedMatch(PathElement pathElement, View view, int i11) {
        View viewFindPrefixedMatch;
        int i12 = this.mIndexStack.read(i11);
        if (matches(pathElement, view)) {
            this.mIndexStack.increment(i11);
            int i13 = pathElement.index;
            if (i13 == -1 || i13 == i12) {
                return view;
            }
        }
        if (pathElement.prefix != 1 || !(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = viewGroup.getChildAt(i14);
            if (childAt != null && (viewFindPrefixedMatch = findPrefixedMatch(pathElement, childAt, i11)) != null) {
                return viewFindPrefixedMatch;
            }
        }
        return null;
    }

    private boolean matches(PathElement pathElement, View view) {
        String str = pathElement.viewClassName;
        if (str == null || hasClassName(view, str)) {
            return -1 == pathElement.viewId || view.getId() == pathElement.viewId;
        }
        return false;
    }

    private void findTargetsInMatchedView(View view, List<PathElement> list, Accumulator accumulator) {
        if (list.isEmpty()) {
            accumulator.accumulate(view);
            return;
        }
        if (this.mIndexStack.full()) {
            SALog.m68589i(TAG, "Path is too deep, there is no memory to perfrom the finding");
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PathElement pathElement = list.get(0);
        List<PathElement> listSubList = list.subList(1, list.size());
        int childCount = viewGroup.getChildCount();
        int iAlloc = this.mIndexStack.alloc();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewFindPrefixedMatch = findPrefixedMatch(pathElement, viewGroup.getChildAt(i11), iAlloc);
            if (viewFindPrefixedMatch != null) {
                findTargetsInMatchedView(viewFindPrefixedMatch, listSubList, accumulator);
            }
            if (pathElement.index >= 0 && this.mIndexStack.read(iAlloc) > pathElement.index) {
                break;
            }
        }
        this.mIndexStack.free();
    }

    public static boolean hasClassName(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass.getCanonicalName() != null; superclass = superclass.getSuperclass()) {
            if (superclass.getCanonicalName().equals(str)) {
                return true;
            }
            if (superclass == Object.class) {
                return false;
            }
        }
        return false;
    }

    public void findTargetsInRoot(View view, List<PathElement> list, Accumulator accumulator) {
        if (!list.isEmpty()) {
            if (this.mIndexStack.full()) {
                SALog.m68589i(TAG, "Path is too deep, there is no memory to perfrom the finding");
                return;
            }
            PathElement pathElement = list.get(0);
            List<PathElement> listSubList = list.subList(1, list.size());
            View viewFindPrefixedMatch = findPrefixedMatch(pathElement, view, this.mIndexStack.alloc());
            this.mIndexStack.free();
            if (viewFindPrefixedMatch != null) {
                findTargetsInMatchedView(viewFindPrefixedMatch, listSubList, accumulator);
            }
        }
    }
}
