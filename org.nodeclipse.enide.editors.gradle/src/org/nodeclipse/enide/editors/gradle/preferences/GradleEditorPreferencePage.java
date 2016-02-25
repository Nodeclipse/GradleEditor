package org.nodeclipse.enide.editors.gradle.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.nodeclipse.enide.editors.gradle.Activator;
//+

/**
 * @author Benjamin gurok
 * @author Paul Verest
 */
public class GradleEditorPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private ColorFieldEditor colorComment;
    private ColorFieldEditor colorDoc;
    private ColorFieldEditor colorKeyword;
    private ColorFieldEditor colorString;
    private ColorFieldEditor colorNumber;
    private ColorFieldEditor colorNormal;
    private BooleanFieldEditor boldAttributeKeyword;
    
    public GradleEditorPreferencePage() {
        super(GRID);
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        setPreferenceStore(store);
        setDescription("Gradle Editor Settings");
        setImageDescriptor(Activator.getImageDescriptor("icons/gradle-icon-16x16.png"));
    }
	@Override
	public void init(IWorkbench workbench) {
	}

	@Override
	protected void createFieldEditors() {
		
	    Composite parent = getFieldEditorParent();

        colorComment = new ColorFieldEditor(GradleEditorConstants.KEY_COLOR_COMMENT, "Comment color:", parent);
        addField(colorComment);

        colorDoc = new ColorFieldEditor(GradleEditorConstants.KEY_COLOR_DOC, "Doc color:", parent);
        addField(colorDoc);

        colorKeyword = new ColorFieldEditor(GradleEditorConstants.KEY_COLOR_KEYWORD, "Keyword color:", parent);
        addField(colorKeyword);

        boldAttributeKeyword = new BooleanFieldEditor(GradleEditorConstants.KEY_BOLD_KEYWORD, "Bold keywords", parent);
        addField(boldAttributeKeyword);

        colorString = new ColorFieldEditor(GradleEditorConstants.KEY_COLOR_STRING, "String color:", parent);
        addField(colorString);

        colorNumber = new ColorFieldEditor(GradleEditorConstants.KEY_COLOR_NUMBER, "Number color:", parent);
        addField(colorNumber);

        colorNormal = new ColorFieldEditor(GradleEditorConstants.KEY_COLOR_NORMAL, "Normal text color:", parent);
        addField(colorNormal);
	}


}
