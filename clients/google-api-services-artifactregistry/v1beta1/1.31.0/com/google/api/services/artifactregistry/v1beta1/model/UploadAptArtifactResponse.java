/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.artifactregistry.v1beta1.model;

/**
 * The response of the completed artifact upload operation. This response is contained in the
 * Operation and available to users.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Artifact Registry API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UploadAptArtifactResponse extends com.google.api.client.json.GenericJson {

  /**
   * The Apt artifacts updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AptArtifact> aptArtifacts;

  static {
    // hack to force ProGuard to consider AptArtifact used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AptArtifact.class);
  }

  /**
   * The Apt artifacts updated.
   * @return value or {@code null} for none
   */
  public java.util.List<AptArtifact> getAptArtifacts() {
    return aptArtifacts;
  }

  /**
   * The Apt artifacts updated.
   * @param aptArtifacts aptArtifacts or {@code null} for none
   */
  public UploadAptArtifactResponse setAptArtifacts(java.util.List<AptArtifact> aptArtifacts) {
    this.aptArtifacts = aptArtifacts;
    return this;
  }

  @Override
  public UploadAptArtifactResponse set(String fieldName, Object value) {
    return (UploadAptArtifactResponse) super.set(fieldName, value);
  }

  @Override
  public UploadAptArtifactResponse clone() {
    return (UploadAptArtifactResponse) super.clone();
  }

}