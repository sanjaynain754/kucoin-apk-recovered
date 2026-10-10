package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.C0467R;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes23.dex */
class AlertController {
    ListAdapter mAdapter;
    private int mAlertDialogLayout;
    private final int mButtonIconDimen;
    Button mButtonNegative;
    private Drawable mButtonNegativeIcon;
    Message mButtonNegativeMessage;
    private CharSequence mButtonNegativeText;
    Button mButtonNeutral;
    private Drawable mButtonNeutralIcon;
    Message mButtonNeutralMessage;
    private CharSequence mButtonNeutralText;
    private int mButtonPanelSideLayout;
    Button mButtonPositive;
    private Drawable mButtonPositiveIcon;
    Message mButtonPositiveMessage;
    private CharSequence mButtonPositiveText;
    private final Context mContext;
    private View mCustomTitleView;
    final AppCompatDialog mDialog;
    Handler mHandler;
    private Drawable mIcon;
    private ImageView mIconView;
    int mListItemLayout;
    int mListLayout;
    ListView mListView;
    private CharSequence mMessage;
    private TextView mMessageView;
    int mMultiChoiceItemLayout;
    NestedScrollView mScrollView;
    private boolean mShowTitle;
    int mSingleChoiceItemLayout;
    private CharSequence mTitle;
    private TextView mTitleView;
    private View mView;
    private int mViewLayoutResId;
    private int mViewSpacingBottom;
    private int mViewSpacingLeft;
    private int mViewSpacingRight;
    private int mViewSpacingTop;
    private final Window mWindow;
    private boolean mViewSpacingSpecified = false;
    private int mIconId = 0;
    int mCheckedItem = -1;
    private int mButtonPanelLayoutHint = 0;
    private final View.OnClickListener mButtonHandler = new View.OnClickListener() { // from class: androidx.appcompat.app.AlertController.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.mButtonPositive && (message3 = alertController.mButtonPositiveMessage) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.mButtonNegative || (message2 = alertController.mButtonNegativeMessage) == null) {
                messageObtain = (view != alertController.mButtonNeutral || (message = alertController.mButtonNeutralMessage) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.mHandler.obtainMessage(1, alertController2.mDialog).sendToTarget();
        }
    };

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$2 */
    public class C04702 implements NestedScrollView.OnScrollChangeListener {
        final /* synthetic */ View val$bottom;
        final /* synthetic */ View val$top;

        public C04702(View view, View view2) {
            this.val$top = view;
            this.val$bottom = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
            AlertController.manageScrollIndicators(nestedScrollView, this.val$top, this.val$bottom);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$3 */
    public class RunnableC04713 implements Runnable {
        final /* synthetic */ View val$bottom;
        final /* synthetic */ View val$top;

        public RunnableC04713(View view, View view2) {
            this.val$top = view;
            this.val$bottom = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.manageScrollIndicators(AlertController.this.mScrollView, this.val$top, this.val$bottom);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$4 */
    public class C04724 implements AbsListView.OnScrollListener {
        final /* synthetic */ View val$bottom;
        final /* synthetic */ View val$top;

        public C04724(View view, View view2) {
            this.val$top = view;
            this.val$bottom = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            AlertController.manageScrollIndicators(absListView, this.val$top, this.val$bottom);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$5 */
    public class RunnableC04735 implements Runnable {
        final /* synthetic */ View val$bottom;
        final /* synthetic */ View val$top;

        public RunnableC04735(View view, View view2) {
            this.val$top = view;
            this.val$bottom = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.manageScrollIndicators(AlertController.this.mListView, this.val$top, this.val$bottom);
        }
    }

    public static class AlertParams {
        public ListAdapter mAdapter;
        public boolean[] mCheckedItems;
        public final Context mContext;
        public Cursor mCursor;
        public View mCustomTitleView;
        public boolean mForceInverseBackground;
        public Drawable mIcon;
        public final LayoutInflater mInflater;
        public String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public CharSequence[] mItems;
        public String mLabelColumn;
        public CharSequence mMessage;
        public Drawable mNegativeButtonIcon;
        public DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public Drawable mNeutralButtonIcon;
        public DialogInterface.OnClickListener mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public DialogInterface.OnCancelListener mOnCancelListener;
        public DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public DialogInterface.OnClickListener mOnClickListener;
        public DialogInterface.OnDismissListener mOnDismissListener;
        public AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public DialogInterface.OnKeyListener mOnKeyListener;
        public OnPrepareListViewListener mOnPrepareListViewListener;
        public Drawable mPositiveButtonIcon;
        public DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public CharSequence mTitle;
        public View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public int mViewSpacingTop;
        public int mIconId = 0;
        public int mIconAttrId = 0;
        public boolean mViewSpacingSpecified = false;
        public int mCheckedItem = -1;
        public boolean mRecycleOnMeasure = true;
        public boolean mCancelable = true;

        public interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        private void createListView(AlertController alertController) {
            AlertParams alertParams;
            final AlertController alertController2;
            ListAdapter checkedItemAdapter;
            final RecycleListView recycleListView = (RecycleListView) this.mInflater.inflate(alertController.mListLayout, (ViewGroup) null);
            if (!this.mIsMultiChoice) {
                alertParams = this;
                alertController2 = alertController;
                int i11 = alertParams.mIsSingleChoice ? alertController2.mSingleChoiceItemLayout : alertController2.mListItemLayout;
                if (alertParams.mCursor != null) {
                    checkedItemAdapter = new SimpleCursorAdapter(alertParams.mContext, i11, alertParams.mCursor, new String[]{alertParams.mLabelColumn}, new int[]{R.id.text1});
                } else {
                    checkedItemAdapter = alertParams.mAdapter;
                    if (checkedItemAdapter == null) {
                        checkedItemAdapter = new CheckedItemAdapter(alertParams.mContext, i11, R.id.text1, alertParams.mItems);
                    }
                }
            } else if (this.mCursor == null) {
                alertParams = this;
                checkedItemAdapter = new ArrayAdapter<CharSequence>(this.mContext, alertController.mMultiChoiceItemLayout, R.id.text1, this.mItems) { // from class: androidx.appcompat.app.AlertController.AlertParams.1
                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public View getView(int i12, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i12, view, viewGroup);
                        boolean[] zArr = AlertParams.this.mCheckedItems;
                        if (zArr != null && zArr[i12]) {
                            recycleListView.setItemChecked(i12, true);
                        }
                        return view2;
                    }
                };
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                alertParams = this;
                alertController2 = alertController;
                checkedItemAdapter = new CursorAdapter(alertParams.mContext, alertParams.mCursor, false) { // from class: androidx.appcompat.app.AlertController.AlertParams.2
                    private final int mIsCheckedIndex;
                    private final int mLabelIndex;

                    {
                        Cursor cursor = getCursor();
                        this.mLabelIndex = cursor.getColumnIndexOrThrow(AlertParams.this.mLabelColumn);
                        this.mIsCheckedIndex = cursor.getColumnIndexOrThrow(AlertParams.this.mIsCheckedColumn);
                    }

                    @Override // android.widget.CursorAdapter
                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        return AlertParams.this.mInflater.inflate(alertController2.mMultiChoiceItemLayout, viewGroup, false);
                    }

                    @Override // android.widget.CursorAdapter
                    public void bindView(View view, Context context, Cursor cursor) {
                        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.mLabelIndex));
                        RecycleListView recycleListView2 = recycleListView;
                        int position = cursor.getPosition();
                        boolean z11 = true;
                        if (cursor.getInt(this.mIsCheckedIndex) != 1) {
                            z11 = false;
                        }
                        recycleListView2.setItemChecked(position, z11);
                    }
                };
            }
            OnPrepareListViewListener onPrepareListViewListener = alertParams.mOnPrepareListViewListener;
            if (onPrepareListViewListener != null) {
                onPrepareListViewListener.onPrepareListView(recycleListView);
            }
            alertController2.mAdapter = checkedItemAdapter;
            alertController2.mCheckedItem = alertParams.mCheckedItem;
            if (alertParams.mOnClickListener != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.3
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i12, long j11) {
                        AlertParams.this.mOnClickListener.onClick(alertController2.mDialog, i12);
                        if (AlertParams.this.mIsSingleChoice) {
                            return;
                        }
                        alertController2.mDialog.dismiss();
                    }
                });
            } else if (alertParams.mOnCheckboxClickListener != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.4
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i12, long j11) {
                        boolean[] zArr = AlertParams.this.mCheckedItems;
                        if (zArr != null) {
                            zArr[i12] = recycleListView.isItemChecked(i12);
                        }
                        AlertParams.this.mOnCheckboxClickListener.onClick(alertController2.mDialog, i12, recycleListView.isItemChecked(i12));
                    }
                });
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = alertParams.mOnItemSelectedListener;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (alertParams.mIsSingleChoice) {
                recycleListView.setChoiceMode(1);
            } else if (alertParams.mIsMultiChoice) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.mListView = recycleListView;
        }

        public void apply(AlertController alertController) {
            AlertController alertController2;
            View view = this.mCustomTitleView;
            if (view != null) {
                alertController.setCustomTitle(view);
            } else {
                CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    alertController.setTitle(charSequence);
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    alertController.setIcon(drawable);
                }
                int i11 = this.mIconId;
                if (i11 != 0) {
                    alertController.setIcon(i11);
                }
                int i12 = this.mIconAttrId;
                if (i12 != 0) {
                    alertController.setIcon(alertController.getIconAttributeResId(i12));
                }
            }
            CharSequence charSequence2 = this.mMessage;
            if (charSequence2 != null) {
                alertController.setMessage(charSequence2);
            }
            CharSequence charSequence3 = this.mPositiveButtonText;
            if (charSequence3 == null && this.mPositiveButtonIcon == null) {
                alertController2 = alertController;
            } else {
                alertController.setButton(-1, charSequence3, this.mPositiveButtonListener, null, this.mPositiveButtonIcon);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.mNegativeButtonText;
            if (charSequence4 != null || this.mNegativeButtonIcon != null) {
                alertController2.setButton(-2, charSequence4, this.mNegativeButtonListener, null, this.mNegativeButtonIcon);
            }
            CharSequence charSequence5 = this.mNeutralButtonText;
            if (charSequence5 != null || this.mNeutralButtonIcon != null) {
                alertController2.setButton(-3, charSequence5, this.mNeutralButtonListener, null, this.mNeutralButtonIcon);
            }
            if (this.mItems != null || this.mCursor != null || this.mAdapter != null) {
                createListView(alertController2);
            }
            View view2 = this.mView;
            if (view2 != null) {
                if (this.mViewSpacingSpecified) {
                    alertController2.setView(view2, this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
                    return;
                } else {
                    alertController2.setView(view2);
                    return;
                }
            }
            int i13 = this.mViewLayoutResId;
            if (i13 != 0) {
                alertController2.setView(i13);
            }
        }

        public AlertParams(Context context) {
            this.mContext = context;
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class ButtonHandler extends Handler {
        private static final int MSG_DISMISS_DIALOG = 1;
        private WeakReference<DialogInterface> mDialog;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == -3 || i11 == -2 || i11 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.mDialog.get(), message.what);
            } else {
                if (i11 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }

        public ButtonHandler(DialogInterface dialogInterface) {
            this.mDialog = new WeakReference<>(dialogInterface);
        }
    }

    public static class RecycleListView extends ListView {
        private final int mPaddingBottomNoButtons;
        private final int mPaddingTopNoTitle;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0467R.styleable.RecycleListView);
            this.mPaddingBottomNoButtons = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0467R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.mPaddingTopNoTitle = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0467R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }

        public void setHasDecor(boolean z11, boolean z12) {
            if (z12 && z11) {
                return;
            }
            setPadding(getPaddingLeft(), z11 ? getPaddingTop() : this.mPaddingTopNoTitle, getPaddingRight(), z12 ? getPaddingBottom() : this.mPaddingBottomNoButtons);
        }
    }

    public static void manageScrollIndicators(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public Button getButton(int i11) {
        if (i11 == -3) {
            return this.mButtonNeutral;
        }
        if (i11 == -2) {
            return this.mButtonNegative;
        }
        if (i11 != -1) {
            return null;
        }
        return this.mButtonPositive;
    }

    public void setIcon(int i11) {
        this.mIcon = null;
        this.mIconId = i11;
        ImageView imageView = this.mIconView;
        if (imageView != null) {
            if (i11 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.mIconView.setImageResource(this.mIconId);
            }
        }
    }

    public void setView(int i11) {
        this.mView = null;
        this.mViewLayoutResId = i11;
        this.mViewSpacingSpecified = false;
    }

    public static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        public CheckedItemAdapter(Context context, int i11, int i12, CharSequence[] charSequenceArr) {
            super(context, i11, i12, charSequenceArr);
        }
    }

    @Nullable
    private ViewGroup resolvePanel(@Nullable View view, @Nullable View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int selectContentView() {
        int i11 = this.mButtonPanelSideLayout;
        if (i11 == 0) {
            return this.mAlertDialogLayout;
        }
        return this.mButtonPanelLayoutHint == 1 ? i11 : this.mAlertDialogLayout;
    }

    private void setScrollIndicators(ViewGroup viewGroup, View view, int i11, int i12) {
        View viewFindViewById = this.mWindow.findViewById(C0467R.id.scrollIndicatorUp);
        View viewFindViewById2 = this.mWindow.findViewById(C0467R.id.scrollIndicatorDown);
        ViewCompat.setScrollIndicators(view, i11, i12);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void setupContent(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.mWindow.findViewById(C0467R.id.scrollView);
        this.mScrollView = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.mScrollView.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.mMessageView = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.mMessage;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.mScrollView.removeView(this.mMessageView);
        if (this.mListView == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.mScrollView.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.mScrollView);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.mListView, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void setupCustomContent(ViewGroup viewGroup) {
        View viewInflate = this.mView;
        if (viewInflate == null) {
            viewInflate = this.mViewLayoutResId != 0 ? LayoutInflater.from(this.mContext).inflate(this.mViewLayoutResId, viewGroup, false) : null;
        }
        boolean z11 = viewInflate != null;
        if (!z11 || !canTextInput(viewInflate)) {
            this.mWindow.setFlags(131072, 131072);
        }
        if (!z11) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.mWindow.findViewById(C0467R.id.custom);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.mViewSpacingSpecified) {
            frameLayout.setPadding(this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
        }
        if (this.mListView != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void setupTitle(ViewGroup viewGroup) {
        if (this.mCustomTitleView != null) {
            viewGroup.addView(this.mCustomTitleView, 0, new ViewGroup.LayoutParams(-1, -2));
            this.mWindow.findViewById(C0467R.id.title_template).setVisibility(8);
            return;
        }
        this.mIconView = (ImageView) this.mWindow.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.mTitle) || !this.mShowTitle) {
            this.mWindow.findViewById(C0467R.id.title_template).setVisibility(8);
            this.mIconView.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.mWindow.findViewById(C0467R.id.alertTitle);
        this.mTitleView = textView;
        textView.setText(this.mTitle);
        int i11 = this.mIconId;
        if (i11 != 0) {
            this.mIconView.setImageResource(i11);
            return;
        }
        Drawable drawable = this.mIcon;
        if (drawable != null) {
            this.mIconView.setImageDrawable(drawable);
        } else {
            this.mTitleView.setPadding(this.mIconView.getPaddingLeft(), this.mIconView.getPaddingTop(), this.mIconView.getPaddingRight(), this.mIconView.getPaddingBottom());
            this.mIconView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setupView() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.mWindow.findViewById(C0467R.id.parentPanel);
        int i11 = C0467R.id.topPanel;
        View viewFindViewById4 = viewFindViewById3.findViewById(i11);
        int i12 = C0467R.id.contentPanel;
        View viewFindViewById5 = viewFindViewById3.findViewById(i12);
        int i13 = C0467R.id.buttonPanel;
        View viewFindViewById6 = viewFindViewById3.findViewById(i13);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(C0467R.id.customPanel);
        setupCustomContent(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i11);
        View viewFindViewById8 = viewGroup.findViewById(i12);
        View viewFindViewById9 = viewGroup.findViewById(i13);
        ViewGroup viewGroupResolvePanel = resolvePanel(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupResolvePanel2 = resolvePanel(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupResolvePanel3 = resolvePanel(viewFindViewById9, viewFindViewById6);
        setupContent(viewGroupResolvePanel2);
        setupButtons(viewGroupResolvePanel3);
        setupTitle(viewGroupResolvePanel);
        boolean z11 = viewGroup.getVisibility() != 8;
        boolean z12 = (viewGroupResolvePanel == null || viewGroupResolvePanel.getVisibility() == 8) ? 0 : 1;
        boolean z13 = (viewGroupResolvePanel3 == null || viewGroupResolvePanel3.getVisibility() == 8) ? false : true;
        if (!z13 && viewGroupResolvePanel2 != null && (viewFindViewById2 = viewGroupResolvePanel2.findViewById(C0467R.id.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z12 != 0) {
            NestedScrollView nestedScrollView = this.mScrollView;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.mMessage == null && this.mListView == null) ? null : viewGroupResolvePanel.findViewById(C0467R.id.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupResolvePanel2 != null && (viewFindViewById = viewGroupResolvePanel2.findViewById(C0467R.id.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.mListView;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z12, z13);
        }
        if (!z11) {
            View view = this.mListView;
            if (view == null) {
                view = this.mScrollView;
            }
            if (view != null) {
                setScrollIndicators(viewGroupResolvePanel2, view, z12 | (z13 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.mListView;
        if (listView2 == null || (listAdapter = this.mAdapter) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i14 = this.mCheckedItem;
        if (i14 > -1) {
            listView2.setItemChecked(i14, true);
            listView2.setSelection(i14);
        }
    }

    private static boolean shouldCenterSingleButton(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0467R.attr.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public int getIconAttributeResId(int i11) {
        TypedValue typedValue = new TypedValue();
        this.mContext.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView getListView() {
        return this.mListView;
    }

    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.mScrollView;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.mScrollView;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    public void setButton(int i11, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.mHandler.obtainMessage(i11, onClickListener);
        }
        if (i11 == -3) {
            this.mButtonNeutralText = charSequence;
            this.mButtonNeutralMessage = message;
            this.mButtonNeutralIcon = drawable;
        } else if (i11 == -2) {
            this.mButtonNegativeText = charSequence;
            this.mButtonNegativeMessage = message;
            this.mButtonNegativeIcon = drawable;
        } else {
            if (i11 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.mButtonPositiveText = charSequence;
            this.mButtonPositiveMessage = message;
            this.mButtonPositiveIcon = drawable;
        }
    }

    public void setButtonPanelLayoutHint(int i11) {
        this.mButtonPanelLayoutHint = i11;
    }

    public void setCustomTitle(View view) {
        this.mCustomTitleView = view;
    }

    public void setMessage(CharSequence charSequence) {
        this.mMessage = charSequence;
        TextView textView = this.mMessageView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.mContext = context;
        this.mDialog = appCompatDialog;
        this.mWindow = window;
        this.mHandler = new ButtonHandler(appCompatDialog);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C0467R.styleable.AlertDialog, C0467R.attr.alertDialogStyle, 0);
        this.mAlertDialogLayout = typedArrayObtainStyledAttributes.getResourceId(C0467R.styleable.AlertDialog_android_layout, 0);
        this.mButtonPanelSideLayout = typedArrayObtainStyledAttributes.getResourceId(C0467R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.mListLayout = typedArrayObtainStyledAttributes.getResourceId(C0467R.styleable.AlertDialog_listLayout, 0);
        this.mMultiChoiceItemLayout = typedArrayObtainStyledAttributes.getResourceId(C0467R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.mSingleChoiceItemLayout = typedArrayObtainStyledAttributes.getResourceId(C0467R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.mListItemLayout = typedArrayObtainStyledAttributes.getResourceId(C0467R.styleable.AlertDialog_listItemLayout, 0);
        this.mShowTitle = typedArrayObtainStyledAttributes.getBoolean(C0467R.styleable.AlertDialog_showTitle, true);
        this.mButtonIconDimen = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0467R.styleable.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        appCompatDialog.supportRequestWindowFeature(1);
    }

    public static boolean canTextInput(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (canTextInput(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void centerButton(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private void setupButtons(ViewGroup viewGroup) {
        int i11;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.mButtonPositive = button;
        button.setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonPositiveText) && this.mButtonPositiveIcon == null) {
            this.mButtonPositive.setVisibility(8);
            i11 = 0;
        } else {
            this.mButtonPositive.setText(this.mButtonPositiveText);
            Drawable drawable = this.mButtonPositiveIcon;
            if (drawable != null) {
                int i12 = this.mButtonIconDimen;
                drawable.setBounds(0, 0, i12, i12);
                this.mButtonPositive.setCompoundDrawables(this.mButtonPositiveIcon, null, null, null);
            }
            this.mButtonPositive.setVisibility(0);
            i11 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.mButtonNegative = button2;
        button2.setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonNegativeText) && this.mButtonNegativeIcon == null) {
            this.mButtonNegative.setVisibility(8);
        } else {
            this.mButtonNegative.setText(this.mButtonNegativeText);
            Drawable drawable2 = this.mButtonNegativeIcon;
            if (drawable2 != null) {
                int i13 = this.mButtonIconDimen;
                drawable2.setBounds(0, 0, i13, i13);
                this.mButtonNegative.setCompoundDrawables(this.mButtonNegativeIcon, null, null, null);
            }
            this.mButtonNegative.setVisibility(0);
            i11 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.mButtonNeutral = button3;
        button3.setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonNeutralText) && this.mButtonNeutralIcon == null) {
            this.mButtonNeutral.setVisibility(8);
        } else {
            this.mButtonNeutral.setText(this.mButtonNeutralText);
            Drawable drawable3 = this.mButtonNeutralIcon;
            if (drawable3 != null) {
                int i14 = this.mButtonIconDimen;
                drawable3.setBounds(0, 0, i14, i14);
                this.mButtonNeutral.setCompoundDrawables(this.mButtonNeutralIcon, null, null, null);
            }
            this.mButtonNeutral.setVisibility(0);
            i11 |= 4;
        }
        if (shouldCenterSingleButton(this.mContext)) {
            if (i11 == 1) {
                centerButton(this.mButtonPositive);
            } else if (i11 == 2) {
                centerButton(this.mButtonNegative);
            } else if (i11 == 4) {
                centerButton(this.mButtonNeutral);
            }
        }
        if (i11 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public void installContent() {
        this.mDialog.setContentView(selectContentView());
        setupView();
    }

    public void setView(View view) {
        this.mView = view;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = false;
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        this.mIconId = 0;
        ImageView imageView = this.mIconView;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.mIconView.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void setView(View view, int i11, int i12, int i13, int i14) {
        this.mView = view;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = true;
        this.mViewSpacingLeft = i11;
        this.mViewSpacingTop = i12;
        this.mViewSpacingRight = i13;
        this.mViewSpacingBottom = i14;
    }
}
