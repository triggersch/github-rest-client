package learningspringboot;

import org.springframework.social.github.api.GitHub;
import org.springframework.social.github.api.GitHubCommit;

public class Issue {
	
	
	private GitHubCommit gitHubCommit;
	private GitHub gitHub;
	
	public Issue(  GitHubCommit gitHubCommit ){
		this.gitHubCommit = gitHubCommit;
	}

	public GitHubCommit getGitHubCommit() {
		return gitHubCommit;
	}
	
	
}
