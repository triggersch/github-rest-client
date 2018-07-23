package learningspringboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.social.github.api.GitHubCommit;
import org.springframework.social.github.api.impl.GitHubTemplate;
import org.springframework.stereotype.Service;

@Service
public class IssueManager {
	
	private String githubToken = "05ef756db1d28e47c4a6c7eebd5777dc1d724c89";
	
	private GitHubTemplate gitHubTemplate = new GitHubTemplate(githubToken);
	
	public List<Issue> findIssues(){
		
		List<Issue> openIssues = new ArrayList<>();
		
		List<GitHubCommit> repos = gitHubTemplate.repoOperations().getCommits("tagbangers", "spring-social-jira");
		
		for (GitHubCommit repo: repos){
			openIssues.add(new Issue(repo));
		}
		
		return openIssues;
	}

}
