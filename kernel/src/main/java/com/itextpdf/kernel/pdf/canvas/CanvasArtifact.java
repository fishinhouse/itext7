package com.itextpdf.kernel.pdf.canvas;

import com.itextpdf.kernel.pdf.PdfName;

/**
 * A subclass of {@link CanvasTag} for Artifacts.
 *
 * In Tagged PDF, an object can be marked as an Artifact in order to signify
 * that it is more part of the document structure than of the document content.
 * Examples are page headers, layout features, etc. Screen readers can choose to
 * ignore Artifacts.
 */
public class CanvasArtifact extends CanvasTag {

    /**
     * Creates a CanvasArtifact object, which is a {@link CanvasTag} with a role
     * of {@link PdfName#Artifact Artifact}.
     */
    public CanvasArtifact() {
        super(PdfName.Artifact);
    }
}