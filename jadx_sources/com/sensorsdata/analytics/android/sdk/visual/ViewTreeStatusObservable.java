package com.sensorsdata.analytics.android.sdk.visual;

import android.annotation.TargetApi;
import android.app.Activity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.sensorsdata.analytics.android.sdk.AopConstants;
import com.sensorsdata.analytics.android.sdk.AppStateManager;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.util.ViewUtil;
import com.sensorsdata.analytics.android.sdk.util.WindowHelper;
import com.sensorsdata.analytics.android.sdk.visual.model.ViewNode;
import com.sensorsdata.analytics.android.sdk.visual.util.Dispatcher;
import com.sensorsdata.analytics.android.sdk.visual.util.VisualUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@TargetApi(16)
public class ViewTreeStatusObservable implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalFocusChangeListener {
    private static final String TAG = "ViewTreeStatusObservable";
    public static volatile ViewTreeStatusObservable viewTreeStatusObservable;
    private Runnable mTraverseRunnable = new TraverseRunnable();
    private SparseArray<ViewNode> mViewNodesWithHashCode = new SparseArray<>();
    private HashMap<String, ViewNode> mViewNodesHashMap = new HashMap<>();

    public class TraverseRunnable implements Runnable {
        public TraverseRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SALog.m68589i(ViewTreeStatusObservable.TAG, "start traverse...");
            ViewTreeStatusObservable.this.traverseNode();
            SALog.m68589i(ViewTreeStatusObservable.TAG, "stop traverse...");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void traverseNode() {
        traverseNode(null);
    }

    public ViewNode getViewNode(View view) {
        ViewNode viewPathAndPosition = null;
        try {
            ViewNode viewNode = this.mViewNodesWithHashCode.get(view.hashCode());
            if (viewNode != null) {
                return viewNode;
            }
            try {
                viewPathAndPosition = ViewUtil.getViewPathAndPosition(view);
                if (viewPathAndPosition == null) {
                    return viewPathAndPosition;
                }
                this.mViewNodesWithHashCode.put(view.hashCode(), viewPathAndPosition);
                return viewPathAndPosition;
            } catch (Exception e11) {
                e = e11;
                viewPathAndPosition = viewNode;
            }
        } catch (Exception e12) {
            e = e12;
        }
        SALog.printStackTrace(e);
        return viewPathAndPosition;
    }

    private String generateKey(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public static ViewTreeStatusObservable getInstance() {
        if (viewTreeStatusObservable == null) {
            synchronized (ViewTreeStatusObservable.class) {
                try {
                    if (viewTreeStatusObservable == null) {
                        viewTreeStatusObservable = new ViewTreeStatusObservable();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return viewTreeStatusObservable;
    }

    private void traverseNode(View view) {
        try {
            SparseArray<ViewNode> sparseArray = new SparseArray<>();
            HashMap<String, ViewNode> map = new HashMap<>();
            if (view != null) {
                traverseNode(view, sparseArray, map);
            } else {
                for (View view2 : WindowHelper.getSortedWindowViews()) {
                    traverseNode(view2, sparseArray, map);
                }
            }
            this.mViewNodesHashMap.clear();
            this.mViewNodesWithHashCode.clear();
            this.mViewNodesHashMap = map;
            this.mViewNodesWithHashCode = sparseArray;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        SALog.m68589i(TAG, "onGlobalFocusChanged");
        traverse();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        SALog.m68589i(TAG, "onGlobalLayout");
        traverse();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        SALog.m68589i(TAG, "onScrollChanged");
        traverse();
    }

    public void traverse() {
        try {
            Dispatcher.getInstance().postDelayed(this.mTraverseRunnable, 100L);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public ViewNode getViewNode(WeakReference<View> weakReference, String str, String str2, String str3) {
        Activity foregroundActivity;
        ViewNode viewNode = null;
        rootView = null;
        View rootView = null;
        try {
            ViewNode viewNode2 = this.mViewNodesHashMap.get(generateKey(str, str2, str3));
            if (viewNode2 != null) {
                return viewNode2;
            }
            if (weakReference != null) {
                try {
                    if (weakReference.get() != null) {
                        rootView = weakReference.get().getRootView();
                    }
                } catch (Exception e11) {
                    e = e11;
                    viewNode = viewNode2;
                    SALog.printStackTrace(e);
                    return viewNode;
                }
            }
            if (rootView == null && (foregroundActivity = AppStateManager.getInstance().getForegroundActivity()) != null && foregroundActivity.getWindow() != null && foregroundActivity.getWindow().isActive()) {
                rootView = foregroundActivity.getWindow().getDecorView();
            }
            if (rootView != null) {
                traverseNode(rootView);
            }
            return this.mViewNodesHashMap.get(generateKey(str, str2, str3));
        } catch (Exception e12) {
            e = e12;
        }
    }

    private void traverseNode(View view, SparseArray<ViewNode> sparseArray, HashMap<String, ViewNode> map) {
        JSONObject screenNameAndTitle;
        try {
            ViewNode viewPathAndPosition = ViewUtil.getViewPathAndPosition(view, true);
            if (viewPathAndPosition != null) {
                sparseArray.put(view.hashCode(), viewPathAndPosition);
                if (!TextUtils.isEmpty(viewPathAndPosition.getViewContent()) && !TextUtils.isEmpty(viewPathAndPosition.getViewPath()) && (screenNameAndTitle = VisualUtil.getScreenNameAndTitle(view, null)) != null) {
                    String strOptString = screenNameAndTitle.optString(AopConstants.SCREEN_NAME);
                    if (!TextUtils.isEmpty(strOptString)) {
                        map.put(generateKey(viewPathAndPosition.getViewPath(), viewPathAndPosition.getViewPosition(), strOptString), viewPathAndPosition);
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt != null) {
                        traverseNode(childAt, sparseArray, map);
                    }
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }
}
