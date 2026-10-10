package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    private final ConstraintLayout mConstraintLayout;
    ConstraintSet mDefaultConstraintSet;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    /* JADX INFO: loaded from: classes23.dex */
    public static class State {
        int mConstraintID;
        ConstraintSet mConstraintSet;
        int mId;
        ArrayList<Variant> mVariants = new ArrayList<>();

        public int findMatch(float f11, float f12) {
            for (int i11 = 0; i11 < this.mVariants.size(); i11++) {
                if (this.mVariants.get(i11).match(f11, f12)) {
                    return i11;
                }
            }
            return -1;
        }

        public void add(Variant variant) {
            this.mVariants.add(variant);
        }

        public State(Context context, XmlPullParser xmlPullParser) {
            this.mConstraintID = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1528R.styleable.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == C1528R.styleable.State_android_id) {
                    this.mId = typedArrayObtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == C1528R.styleable.State_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class Variant {
        int mConstraintID;
        ConstraintSet mConstraintSet;
        int mId;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public boolean match(float f11, float f12) {
            if (!Float.isNaN(this.mMinWidth) && f11 < this.mMinWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMinHeight) && f12 < this.mMinHeight) {
                return false;
            }
            if (Float.isNaN(this.mMaxWidth) || f11 <= this.mMaxWidth) {
                return Float.isNaN(this.mMaxHeight) || f12 <= this.mMaxHeight;
            }
            return false;
        }

        public Variant(Context context, XmlPullParser xmlPullParser) {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1528R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == C1528R.styleable.Variant_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                } else if (index == C1528R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == C1528R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == C1528R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == C1528R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void load(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            int eventType = xml.getEventType();
            State state = null;
            while (true) {
                byte b11 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b11 = -1;
                            } else {
                                b11 = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b11 = -1;
                            } else {
                                b11 = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b11 = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b11 = -1;
                            } else {
                                b11 = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b11 = -1;
                            } else {
                                b11 = 3;
                            }
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    if (b11 == 2) {
                        State state2 = new State(context, xml);
                        this.mStateList.put(state2.mId, state2);
                        state = state2;
                    } else if (b11 == 3) {
                        Variant variant = new Variant(context, xml);
                        if (state != null) {
                            state.add(variant);
                        }
                    } else if (b11 == 4) {
                        parseConstraintSet(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i11, e11);
        } catch (XmlPullParserException e12) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i11, e12);
        }
    }

    private void parseConstraintSet(Context context, XmlPullParser xmlPullParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.load(context, xmlPullParser);
                this.mConstraintSetMap.put(identifier, constraintSet);
                return;
            }
        }
    }

    public boolean needsToChange(int i11, float f11, float f12) {
        int i12 = this.mCurrentStateId;
        if (i12 != i11) {
            return true;
        }
        State stateValueAt = i11 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i12);
        int i13 = this.mCurrentConstraintNumber;
        return (i13 == -1 || !stateValueAt.mVariants.get(i13).match(f11, f12)) && this.mCurrentConstraintNumber != stateValueAt.findMatch(f11, f12);
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public void updateConstraints(int i11, float f11, float f12) {
        int iFindMatch;
        int i12 = this.mCurrentStateId;
        if (i12 == i11) {
            State stateValueAt = i11 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i12);
            int i13 = this.mCurrentConstraintNumber;
            if ((i13 == -1 || !stateValueAt.mVariants.get(i13).match(f11, f12)) && this.mCurrentConstraintNumber != (iFindMatch = stateValueAt.findMatch(f11, f12))) {
                ConstraintSet constraintSet = iFindMatch == -1 ? this.mDefaultConstraintSet : stateValueAt.mVariants.get(iFindMatch).mConstraintSet;
                int i14 = iFindMatch == -1 ? stateValueAt.mConstraintID : stateValueAt.mVariants.get(iFindMatch).mConstraintID;
                if (constraintSet == null) {
                    return;
                }
                this.mCurrentConstraintNumber = iFindMatch;
                ConstraintsChangedListener constraintsChangedListener = this.mConstraintsChangedListener;
                if (constraintsChangedListener != null) {
                    constraintsChangedListener.preLayoutChange(-1, i14);
                }
                constraintSet.applyTo(this.mConstraintLayout);
                ConstraintsChangedListener constraintsChangedListener2 = this.mConstraintsChangedListener;
                if (constraintsChangedListener2 != null) {
                    constraintsChangedListener2.postLayoutChange(-1, i14);
                    return;
                }
                return;
            }
            return;
        }
        this.mCurrentStateId = i11;
        State state = this.mStateList.get(i11);
        int iFindMatch2 = state.findMatch(f11, f12);
        ConstraintSet constraintSet2 = iFindMatch2 == -1 ? state.mConstraintSet : state.mVariants.get(iFindMatch2).mConstraintSet;
        int i15 = iFindMatch2 == -1 ? state.mConstraintID : state.mVariants.get(iFindMatch2).mConstraintID;
        if (constraintSet2 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i11 + ", dim =" + f11 + ", " + f12);
            return;
        }
        this.mCurrentConstraintNumber = iFindMatch2;
        ConstraintsChangedListener constraintsChangedListener3 = this.mConstraintsChangedListener;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.preLayoutChange(i11, i15);
        }
        constraintSet2.applyTo(this.mConstraintLayout);
        ConstraintsChangedListener constraintsChangedListener4 = this.mConstraintsChangedListener;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.postLayoutChange(i11, i15);
        }
    }

    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i11) {
        this.mConstraintLayout = constraintLayout;
        load(context, i11);
    }
}
