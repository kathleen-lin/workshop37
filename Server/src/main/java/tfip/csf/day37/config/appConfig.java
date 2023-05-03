package tfip.csf.day37.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class appConfig {

    @Value("${DO_STORAGE_KEY}")
    private String accessKey;

    @Value("${DO_STORAGE_SECRETKEY}")
    private String secretKey;

    @Value("${DO_STORAGE_ENDPOINT}")
    private String endPoint;

    @Value("${DO_STORAGE_ENDPOINT_REGION}")
    private String endpointRegion;

    
    public AmazonS3 createS3Client(){
    
        BasicAWSCredentials cred = new BasicAWSCredentials(accessKey, secretKey);
        EndpointConfiguration epConfig = new EndpointConfiguration(
        endPoint, endpointRegion);
        return AmazonS3ClientBuilder.standard()
        .withEndpointConfiguration(epConfig)
        .withCredentials(new AWSStaticCredentialsProvider(cred))
        .build();
    }
    
}
