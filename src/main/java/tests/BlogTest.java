package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class BlogTest extends BaseTest {
	
	@Test(priority = 0)
	public void blogTest() throws InterruptedException {
		
		page.blogPage.hoverBlog();
		Thread.sleep(3000);
		page.blogPage.Audiopage();
		Thread.sleep(3000);
	}
	
	@Test(priority = 1)
	public void slider() throws InterruptedException {
		
		page.blogPage.Audiopage();
		page.blogPage.sliderAudio(page.blogPage.song,200, 0);
		Thread.sleep(3000);
		
		page.blogPage.sliderAudio(page.blogPage.sound, 50, 0);
		Thread.sleep(3000);
	}

}
